package com.shareexchange.service;

import com.shareexchange.dto.LoginRequestDto;
import com.shareexchange.dto.RegisterRequestDto;
import com.shareexchange.mapper.AdminMapper;
import com.shareexchange.mapper.UserMapper;
import com.shareexchange.model.Admin;
import com.shareexchange.model.AdminExample;
import com.shareexchange.model.User;
import com.shareexchange.model.UserExample;
import common.RoleEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginService {

    @Resource
    AdminMapper adminMapper;

    @Resource
    UserMapper userMapper;

    public Admin adminLogin(LoginRequestDto param) {
        AdminExample example = new AdminExample();
        example.createCriteria()
                .andAdminIdEqualTo(Long.parseLong(param.getAccount()))
                .andPasswordEqualTo(param.getAccount());
        List<Admin> result = adminMapper.selectByExample(example);
        if (result != null && result.size() > 0) {
            return result.get(0);
        }

        return null;
    }

    public User userLogin(LoginRequestDto param){
        UserExample example = new UserExample();
        example.createCriteria()
                .andUserIdEqualTo(Long.parseLong(param.getAccount()))
                .andPasswordEqualTo(param.getPassword());
        List<User> users = userMapper.selectByExample(example);
        if(users != null && users.size() > 0){
            return users.get(0);
        }

        return null;
    }

    public Boolean register(RegisterRequestDto param){
        if(RoleEnum.ADMIN.equals(param.getRole())){
            Admin admin = new Admin();
            admin.setAdminId(Long.parseLong(param.getAccount()));
            admin.setAdminName(param.getNikeName());
            admin.setPassword(param.getPassword());
            try {
                adminMapper.insertSelective(admin);
            } catch (Exception e){
                return false;
            }
            return true;
        }

        User user = new User();
        user.setUserId(Long.parseLong(param.getAccount()));
        user.setUserName(param.getNikeName());
        user.setPassword(param.getPassword());
        try {
            userMapper.insertSelective(user);
        } catch (Exception e){
            return false;
        }
        return true;

    }
}
