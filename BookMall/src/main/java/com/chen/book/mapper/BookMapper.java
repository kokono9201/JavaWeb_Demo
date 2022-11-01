package com.chen.book.mapper;

import com.chen.book.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

/**
 * @author CHEN
 * @create 2022-10-31-0:54
 */
@Mapper
public interface BookMapper {

    List<Book> getBookList();
    Book getBook(Integer id);
}
