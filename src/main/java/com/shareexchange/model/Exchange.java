package com.shareexchange.model;

import java.util.Date;

public class Exchange {
    private Long id;

    private Long userId;

    private Long exchangeId;

    private String exchangeName;

    private String exchangeImage;

    private String exchangeTitle;

    private String exchangeReason;

    private Byte status;

    private Long operateId;

    private Byte operateRole;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Long exchangeId) {
        this.exchangeId = exchangeId;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName == null ? null : exchangeName.trim();
    }

    public String getExchangeImage() {
        return exchangeImage;
    }

    public void setExchangeImage(String exchangeImage) {
        this.exchangeImage = exchangeImage == null ? null : exchangeImage.trim();
    }

    public String getExchangeTitle() {
        return exchangeTitle;
    }

    public void setExchangeTitle(String exchangeTitle) {
        this.exchangeTitle = exchangeTitle == null ? null : exchangeTitle.trim();
    }

    public String getExchangeReason() {
        return exchangeReason;
    }

    public void setExchangeReason(String exchangeReason) {
        this.exchangeReason = exchangeReason == null ? null : exchangeReason.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getOperateId() {
        return operateId;
    }

    public void setOperateId(Long operateId) {
        this.operateId = operateId;
    }

    public Byte getOperateRole() {
        return operateRole;
    }

    public void setOperateRole(Byte operateRole) {
        this.operateRole = operateRole;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}