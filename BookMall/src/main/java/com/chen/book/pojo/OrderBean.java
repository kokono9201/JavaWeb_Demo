package com.chen.book.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author CHEN
 * @create 2022-10-30-22:02
 */
public class OrderBean {
    private Integer id;
    private String orderNo;
    private Date orderDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public User getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(User orderUser) {
        this.orderUser = orderUser;
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrderItem> getOrderItemlist() {
        return orderItemlist;
    }

    public void setOrderItemlist(List<OrderItem> orderItemlist) {
        this.orderItemlist = orderItemlist;
    }

    private User orderUser;
    private Double orderMoney;
    private Integer orderStatus;

    private List<OrderItem> orderItemlist;

    public OrderBean() {
    }
}
