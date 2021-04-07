package com.shareexchange.dto;

public class AddShareParam {
    private String shareName;

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public AddShareParam(String shareName) {
        this.shareName = shareName;
    }
}
