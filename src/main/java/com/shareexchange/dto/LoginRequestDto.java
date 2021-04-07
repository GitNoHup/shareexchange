package com.shareexchange.dto;

import common.RoleEnum;

public class LoginRequestDto {
    private String account;

    private String password;

    private RoleEnum role;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public LoginRequestDto(String account, String password, RoleEnum role) {
        this.account = account;
        this.password = password;
        this.role = role;
    }
}
