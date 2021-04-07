package com.shareexchange.controller;

import com.shareexchange.dto.LoginRequestDto;
import com.shareexchange.dto.RegisterRequestDto;
import com.shareexchange.model.Admin;
import com.shareexchange.model.User;
import com.shareexchange.service.LoginService;
import common.ResultEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/userLogin")
    public ResultEntity<Boolean> userLogin(LoginRequestDto param, HttpServletResponse response){
        if(StringUtils.isBlank(param.getAccount())
                || StringUtils.isBlank(param.getPassword())
                || param.getRole() == null){
            return ResultEntity.getInstance(10000, "检查参数", false);
        }

        User result = loginService.userLogin(param);
        if(result != null) {
            Cookie cookie = new Cookie("token", result.getUserId().toString());
            cookie.setPath("/");
            response.addCookie(cookie);
            return ResultEntity.getInstance(0, "返回结果", true);
        }
        return ResultEntity.getInstance(10000, "用户名密码不正确！", false);
    }

    @RequestMapping("/userRegister")
    public ResultEntity<Boolean> userRegister(RegisterRequestDto param){
        if(StringUtils.isBlank(param.getAccount())
                || StringUtils.isBlank(param.getPassword())
                || param.getRole() == null
                || StringUtils.isBlank(param.getNikeName())){
            return ResultEntity.getInstance(10000, "检查参数", false);
        }
        Boolean result = loginService.register(param);
        return ResultEntity.getInstance(0, "返回结果", result);
    }
}
