package com.chen.book.service.Impl;

import com.chen.book.mapper.BookMapper;
import com.chen.book.pojo.Book;
import com.chen.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * @author CHEN
 * @create 2022-10-31-0:57
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getBookList() {
        return bookMapper.getBookList();
    }

    @Override
    public Book getBook(Integer id) {
        return bookMapper.getBook(id);
    }
}
