package com.chen.book.controller;

import com.chen.book.pojo.Book;
import com.chen.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Collection;
import java.util.List;

/**
 * @author CHEN
 * @create 2022-10-31-1:03
 */
@Controller
@SessionAttributes("currentUser")
public class BookController {

    @Autowired
    private BookService bookService;



    @RequestMapping(value = "/booklist")
    public String index(Model model){
        List<Book> list = bookService.getBookList();
        model.addAttribute("list", list);
        return "index";
    }

}
