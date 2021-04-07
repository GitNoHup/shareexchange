package com.shareexchange.dto;

public class ShareSearchParam {
    private String shareName;

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public ShareSearchParam(String shareName) {
        this.shareName = shareName;
    }
}
