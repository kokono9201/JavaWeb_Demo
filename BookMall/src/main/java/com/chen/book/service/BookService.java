package com.chen.book.service;

import com.chen.book.pojo.Book;

import java.util.Collection;
import java.util.List;

/**
 * @author CHEN
 * @create 2022-10-31-0:57
 */
public interface BookService {

    List<Book> getBookList();
    Book getBook (Integer id);

}
