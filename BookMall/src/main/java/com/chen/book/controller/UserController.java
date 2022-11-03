package com.chen.book.controller;

import com.chen.book.mapper.UserMapper;
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

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author CHEN
 * @create 2022-10-30-23:00
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private CartItemService cartItemService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(String uname, String pwd, HttpSession session){

        User user = userService.login(uname,pwd);

        if(user!=null){
            Cart cart = cartItemService.getCart(user);
            user.setCart(cart);
            session.setAttribute("currentUser", user);
//            map.addFlashAttribute("currentUser",user);

            return "redirect:/index";
        }

        return "/user/login";

    }

    @RequestMapping("/toRegist")
    public String toRegist(){
        return "/user/regist";
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public String regist(User user, HttpSession session, String verifyCode, HttpServletResponse response) throws IOException {
        Object key = session.getAttribute("KAPTCHA_SESSION_KEY");
        if(key==null || !verifyCode.equals(key)){
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter writer = response.getWriter();
            writer.println("<script language='javascript'>alert('Wrong Captcha!')</script>");
            return "/user/regist";

        }else{
            if(verifyCode.equals(key)){
                userService.regist(user);
            }

        }
        session.setAttribute("currentUser", user);
        Cart cart = cartItemService.getCart(user);
        user.setCart(cart);
        return "redirect:/index";
    }
}
