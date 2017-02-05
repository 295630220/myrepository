package com.jd.web.controller;

import com.jd.domain.User;
import com.jd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/4.
 */
@Controller
@RequestMapping("/userLogin")
public class UserController {

    @Autowired(required = true)
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, Model model) throws Exception{
        User existUser = userService.login(user);
        if(existUser!=null){
            return "success";
        }
        model.addAttribute("msg","用户名后者密码错误");
        return "fail";
    }
}
