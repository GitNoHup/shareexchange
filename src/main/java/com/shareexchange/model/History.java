package com.shareexchange.model;

import java.util.Date;

public class History {
    private Long id;

    private Long operateId;

    private Byte operateRole;

    private String goodsId;

    private Byte goodsRole;

    private Byte shareStatus;

    private Byte exchangeStatus;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public Byte getGoodsRole() {
        return goodsRole;
    }

    public void setGoodsRole(Byte goodsRole) {
        this.goodsRole = goodsRole;
    }

    public Byte getShareStatus() {
        return shareStatus;
    }

    public void setShareStatus(Byte shareStatus) {
        this.shareStatus = shareStatus;
    }

    public Byte getExchangeStatus() {
        return exchangeStatus;
    }

    public void setExchangeStatus(Byte exchangeStatus) {
        this.exchangeStatus = exchangeStatus;
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