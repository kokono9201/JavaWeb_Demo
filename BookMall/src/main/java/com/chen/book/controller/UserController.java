package com.chen.book.controller;

import com.chen.book.pojo.Cart;
import com.chen.book.pojo.User;
import com.chen.book.service.BookService;
import com.chen.book.service.CartItemService;
import com.chen.book.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpSession;

/**
 * @author CHEN
 * @create 2022-10-30-23:00
 */
@Controller
@SessionAttributes("currentUser")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private CartItemService cartItemService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String uname, String pwd, RedirectAttributesModelMap map){

        User user = userService.login(uname,pwd);

        if(user!=null){
            Cart cart = cartItemService.getCart(user);
            user.setCart(cart);
            map.addFlashAttribute("currentUser",user);

            return "redirect:/booklist";
        }

        return "/user/login";

    }
}
