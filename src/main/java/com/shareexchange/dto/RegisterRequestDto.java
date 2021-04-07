package com.shareexchange.dto;

import common.RoleEnum;

public class RegisterRequestDto {
    private String account;

    private String password;

    private String nikeName;

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

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public RegisterRequestDto(String account, String password, String nikeName, RoleEnum role) {
        this.account = account;
        this.password = password;
        this.nikeName = nikeName;
        this.role = role;
    }
}
