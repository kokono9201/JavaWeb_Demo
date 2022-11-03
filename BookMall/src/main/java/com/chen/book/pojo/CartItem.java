package com.chen.book.pojo;

import java.math.BigDecimal;

/**
 * @author CHEN
 * @create 2022-10-30-22:05
 */
public class CartItem {
    private Integer id;
    private Book book;
    private Integer buyCount;
    private User userBean;
    private Double tempCount;

    public Double getTempCount() {
        BigDecimal bigDecimalPrice = new BigDecimal(getBook().getPrice()+"");
        BigDecimal bigDecimalBuyCount = new BigDecimal(buyCount+"");
        BigDecimal multiply = bigDecimalPrice.multiply(bigDecimalBuyCount);
        tempCount = multiply.doubleValue();
        return tempCount;
    }

    public CartItem(Integer cartItemId, Integer buyCount) {
        this.id=cartItemId;
        this.buyCount=buyCount;
    }

    public Integer getId() {
        return id;
    }

    public CartItem() {
    }

    public CartItem(Book book, Integer buyCount, User userBean) {
        this.book = book;
        this.buyCount = buyCount;
        this.userBean = userBean;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }

}
