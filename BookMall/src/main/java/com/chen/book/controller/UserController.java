package com.chen.book.controller;

import com.chen.book.pojo.User;
import com.chen.book.service.BookService;
import com.chen.book.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author CHEN
 * @create 2022-10-30-23:00
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String uname, String pwd, Model model){

        User user = userService.login(uname,pwd);

        if(user!=null){
            model.addAttribute("currentUser",user);
            return "redirect:/book";
        }

        return "/user/login";

    }
}
