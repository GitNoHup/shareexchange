package com.shareexchange.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/manager")
public class UserManager {

    @GetMapping("/admin/login")
    public String adminLogin(){
        return "login";
    }

    @GetMapping("/user/login")
    public String userLogin(){
        return "login";
    }
}
