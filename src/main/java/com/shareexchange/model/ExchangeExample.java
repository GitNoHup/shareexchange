package com.shareexchange.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNull() {
            addCriterion("exchange_id is null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIsNotNull() {
            addCriterion("exchange_id is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeIdEqualTo(Long value) {
            addCriterion("exchange_id =", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotEqualTo(Long value) {
            addCriterion("exchange_id <>", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThan(Long value) {
            addCriterion("exchange_id >", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("exchange_id >=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThan(Long value) {
            addCriterion("exchange_id <", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdLessThanOrEqualTo(Long value) {
            addCriterion("exchange_id <=", value, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdIn(List<Long> values) {
            addCriterion("exchange_id in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotIn(List<Long> values) {
            addCriterion("exchange_id not in", values, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdBetween(Long value1, Long value2) {
            addCriterion("exchange_id between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeIdNotBetween(Long value1, Long value2) {
            addCriterion("exchange_id not between", value1, value2, "exchangeId");
            return (Criteria) this;
        }

        public Criteria andExchangeNameIsNull() {
            addCriterion("exchange_name is null");
            return (Criteria) this;
        }

        public Criteria andExchangeNameIsNotNull() {
            addCriterion("exchange_name is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeNameEqualTo(String value) {
            addCriterion("exchange_name =", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameNotEqualTo(String value) {
            addCriterion("exchange_name <>", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameGreaterThan(String value) {
            addCriterion("exchange_name >", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_name >=", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameLessThan(String value) {
            addCriterion("exchange_name <", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameLessThanOrEqualTo(String value) {
            addCriterion("exchange_name <=", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameLike(String value) {
            addCriterion("exchange_name like", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameNotLike(String value) {
            addCriterion("exchange_name not like", value, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameIn(List<String> values) {
            addCriterion("exchange_name in", values, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameNotIn(List<String> values) {
            addCriterion("exchange_name not in", values, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameBetween(String value1, String value2) {
            addCriterion("exchange_name between", value1, value2, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeNameNotBetween(String value1, String value2) {
            addCriterion("exchange_name not between", value1, value2, "exchangeName");
            return (Criteria) this;
        }

        public Criteria andExchangeImageIsNull() {
            addCriterion("exchange_image is null");
            return (Criteria) this;
        }

        public Criteria andExchangeImageIsNotNull() {
            addCriterion("exchange_image is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeImageEqualTo(String value) {
            addCriterion("exchange_image =", value, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageNotEqualTo(String value) {
            addCriterion("exchange_image <>", value, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageGreaterThan(String value) {
            addCriterion("exchange_image >", value, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_image >=", value, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageLessThan(String value) {
            addCriterion("exchange_image <", value, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageLessThanOrEqualTo(String value) {
            addCriterion("exchange_image <=", value, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageLike(String value) {
            addCriterion("exchange_image like", value, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageNotLike(String value) {
            addCriterion("exchange_image not like", value, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageIn(List<String> values) {
            addCriterion("exchange_image in", values, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageNotIn(List<String> values) {
            addCriterion("exchange_image not in", values, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageBetween(String value1, String value2) {
            addCriterion("exchange_image between", value1, value2, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeImageNotBetween(String value1, String value2) {
            addCriterion("exchange_image not between", value1, value2, "exchangeImage");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleIsNull() {
            addCriterion("exchange_title is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleIsNotNull() {
            addCriterion("exchange_title is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleEqualTo(String value) {
            addCriterion("exchange_title =", value, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleNotEqualTo(String value) {
            addCriterion("exchange_title <>", value, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleGreaterThan(String value) {
            addCriterion("exchange_title >", value, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_title >=", value, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleLessThan(String value) {
            addCriterion("exchange_title <", value, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleLessThanOrEqualTo(String value) {
            addCriterion("exchange_title <=", value, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleLike(String value) {
            addCriterion("exchange_title like", value, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleNotLike(String value) {
            addCriterion("exchange_title not like", value, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleIn(List<String> values) {
            addCriterion("exchange_title in", values, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleNotIn(List<String> values) {
            addCriterion("exchange_title not in", values, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleBetween(String value1, String value2) {
            addCriterion("exchange_title between", value1, value2, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeTitleNotBetween(String value1, String value2) {
            addCriterion("exchange_title not between", value1, value2, "exchangeTitle");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIsNull() {
            addCriterion("exchange_reason is null");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIsNotNull() {
            addCriterion("exchange_reason is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonEqualTo(String value) {
            addCriterion("exchange_reason =", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotEqualTo(String value) {
            addCriterion("exchange_reason <>", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonGreaterThan(String value) {
            addCriterion("exchange_reason >", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_reason >=", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLessThan(String value) {
            addCriterion("exchange_reason <", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLessThanOrEqualTo(String value) {
            addCriterion("exchange_reason <=", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonLike(String value) {
            addCriterion("exchange_reason like", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotLike(String value) {
            addCriterion("exchange_reason not like", value, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonIn(List<String> values) {
            addCriterion("exchange_reason in", values, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotIn(List<String> values) {
            addCriterion("exchange_reason not in", values, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonBetween(String value1, String value2) {
            addCriterion("exchange_reason between", value1, value2, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andExchangeReasonNotBetween(String value1, String value2) {
            addCriterion("exchange_reason not between", value1, value2, "exchangeReason");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOperateIdIsNull() {
            addCriterion("operate_id is null");
            return (Criteria) this;
        }

        public Criteria andOperateIdIsNotNull() {
            addCriterion("operate_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperateIdEqualTo(Long value) {
            addCriterion("operate_id =", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotEqualTo(Long value) {
            addCriterion("operate_id <>", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdGreaterThan(Long value) {
            addCriterion("operate_id >", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operate_id >=", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdLessThan(Long value) {
            addCriterion("operate_id <", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdLessThanOrEqualTo(Long value) {
            addCriterion("operate_id <=", value, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdIn(List<Long> values) {
            addCriterion("operate_id in", values, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotIn(List<Long> values) {
            addCriterion("operate_id not in", values, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdBetween(Long value1, Long value2) {
            addCriterion("operate_id between", value1, value2, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateIdNotBetween(Long value1, Long value2) {
            addCriterion("operate_id not between", value1, value2, "operateId");
            return (Criteria) this;
        }

        public Criteria andOperateRoleIsNull() {
            addCriterion("operate_role is null");
            return (Criteria) this;
        }

        public Criteria andOperateRoleIsNotNull() {
            addCriterion("operate_role is not null");
            return (Criteria) this;
        }

        public Criteria andOperateRoleEqualTo(Byte value) {
            addCriterion("operate_role =", value, "operateRole");
            return (Criteria) this;
        }

        public Criteria andOperateRoleNotEqualTo(Byte value) {
            addCriterion("operate_role <>", value, "operateRole");
            return (Criteria) this;
        }

        public Criteria andOperateRoleGreaterThan(Byte value) {
            addCriterion("operate_role >", value, "operateRole");
            return (Criteria) this;
        }

        public Criteria andOperateRoleGreaterThanOrEqualTo(Byte value) {
            addCriterion("operate_role >=", value, "operateRole");
            return (Criteria) this;
        }

        public Criteria andOperateRoleLessThan(Byte value) {
            addCriterion("operate_role <", value, "operateRole");
            return (Criteria) this;
        }

        public Criteria andOperateRoleLessThanOrEqualTo(Byte value) {
            addCriterion("operate_role <=", value, "operateRole");
            return (Criteria) this;
        }

        public Criteria andOperateRoleIn(List<Byte> values) {
            addCriterion("operate_role in", values, "operateRole");
            return (Criteria) this;
        }

        public Criteria andOperateRoleNotIn(List<Byte> values) {
            addCriterion("operate_role not in", values, "operateRole");
            return (Criteria) this;
        }

        public Criteria andOperateRoleBetween(Byte value1, Byte value2) {
            addCriterion("operate_role between", value1, value2, "operateRole");
            return (Criteria) this;
        }

        public Criteria andOperateRoleNotBetween(Byte value1, Byte value2) {
            addCriterion("operate_role not between", value1, value2, "operateRole");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}