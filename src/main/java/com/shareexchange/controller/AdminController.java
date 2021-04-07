package com.shareexchange.controller;

import com.shareexchange.dto.LoginRequestDto;
import com.shareexchange.dto.RegisterRequestDto;
import com.shareexchange.model.Admin;
import com.shareexchange.service.LoginService;
import common.ResultEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/adminController")
public class AdminController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/adminLogin")
    public ResultEntity<Boolean> adminLogin(@RequestBody LoginRequestDto param, HttpServletResponse response){
        if(StringUtils.isBlank(param.getAccount())
                || StringUtils.isBlank(param.getPassword())
                || param.getRole() == null){
            return ResultEntity.getInstance(10000, "检查参数", false);
        }
        Admin result = loginService.adminLogin(param);
        if(result != null) {
            Cookie cookie = new Cookie("token", result.getAdminId().toString());
            cookie.setPath("/");
            response.addCookie(cookie);
            return ResultEntity.getInstance(0, "返回结果", true);
        }
        return ResultEntity.getInstance(10000, "用户名密码不正确！", false);
    }

    @RequestMapping("/adminRegister")
    public ResultEntity<Boolean> adminRegister(@RequestBody RegisterRequestDto param){
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
