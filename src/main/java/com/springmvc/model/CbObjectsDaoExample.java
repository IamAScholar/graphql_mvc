package com.springmvc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CbObjectsDaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CbObjectsDaoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNull() {
            addCriterion("entity_type is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("entity_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(String value) {
            addCriterion("entity_type =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(String value) {
            addCriterion("entity_type <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(String value) {
            addCriterion("entity_type >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("entity_type >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(String value) {
            addCriterion("entity_type <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(String value) {
            addCriterion("entity_type <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLike(String value) {
            addCriterion("entity_type like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotLike(String value) {
            addCriterion("entity_type not like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<String> values) {
            addCriterion("entity_type in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<String> values) {
            addCriterion("entity_type not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(String value1, String value2) {
            addCriterion("entity_type between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(String value1, String value2) {
            addCriterion("entity_type not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNull() {
            addCriterion("entity_id is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(Long value) {
            addCriterion("entity_id =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(Long value) {
            addCriterion("entity_id <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(Long value) {
            addCriterion("entity_id >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("entity_id >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(Long value) {
            addCriterion("entity_id <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(Long value) {
            addCriterion("entity_id <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<Long> values) {
            addCriterion("entity_id in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<Long> values) {
            addCriterion("entity_id not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(Long value1, Long value2) {
            addCriterion("entity_id between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(Long value1, Long value2) {
            addCriterion("entity_id not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameIsNull() {
            addCriterion("normalized_name is null");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameIsNotNull() {
            addCriterion("normalized_name is not null");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameEqualTo(String value) {
            addCriterion("normalized_name =", value, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameNotEqualTo(String value) {
            addCriterion("normalized_name <>", value, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameGreaterThan(String value) {
            addCriterion("normalized_name >", value, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameGreaterThanOrEqualTo(String value) {
            addCriterion("normalized_name >=", value, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameLessThan(String value) {
            addCriterion("normalized_name <", value, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameLessThanOrEqualTo(String value) {
            addCriterion("normalized_name <=", value, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameLike(String value) {
            addCriterion("normalized_name like", value, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameNotLike(String value) {
            addCriterion("normalized_name not like", value, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameIn(List<String> values) {
            addCriterion("normalized_name in", values, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameNotIn(List<String> values) {
            addCriterion("normalized_name not in", values, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameBetween(String value1, String value2) {
            addCriterion("normalized_name between", value1, value2, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andNormalizedNameNotBetween(String value1, String value2) {
            addCriterion("normalized_name not between", value1, value2, "normalizedName");
            return (Criteria) this;
        }

        public Criteria andPermalinkIsNull() {
            addCriterion("permalink is null");
            return (Criteria) this;
        }

        public Criteria andPermalinkIsNotNull() {
            addCriterion("permalink is not null");
            return (Criteria) this;
        }

        public Criteria andPermalinkEqualTo(String value) {
            addCriterion("permalink =", value, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkNotEqualTo(String value) {
            addCriterion("permalink <>", value, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkGreaterThan(String value) {
            addCriterion("permalink >", value, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkGreaterThanOrEqualTo(String value) {
            addCriterion("permalink >=", value, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkLessThan(String value) {
            addCriterion("permalink <", value, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkLessThanOrEqualTo(String value) {
            addCriterion("permalink <=", value, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkLike(String value) {
            addCriterion("permalink like", value, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkNotLike(String value) {
            addCriterion("permalink not like", value, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkIn(List<String> values) {
            addCriterion("permalink in", values, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkNotIn(List<String> values) {
            addCriterion("permalink not in", values, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkBetween(String value1, String value2) {
            addCriterion("permalink between", value1, value2, "permalink");
            return (Criteria) this;
        }

        public Criteria andPermalinkNotBetween(String value1, String value2) {
            addCriterion("permalink not between", value1, value2, "permalink");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("category_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("category_code =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("category_code <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("category_code >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_code >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("category_code <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("category_code <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("category_code like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("category_code not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("category_code in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("category_code not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("category_code between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("category_code not between", value1, value2, "categoryCode");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFoundedAtIsNull() {
            addCriterion("founded_at is null");
            return (Criteria) this;
        }

        public Criteria andFoundedAtIsNotNull() {
            addCriterion("founded_at is not null");
            return (Criteria) this;
        }

        public Criteria andFoundedAtEqualTo(Date value) {
            addCriterionForJDBCDate("founded_at =", value, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andFoundedAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("founded_at <>", value, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andFoundedAtGreaterThan(Date value) {
            addCriterionForJDBCDate("founded_at >", value, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andFoundedAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("founded_at >=", value, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andFoundedAtLessThan(Date value) {
            addCriterionForJDBCDate("founded_at <", value, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andFoundedAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("founded_at <=", value, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andFoundedAtIn(List<Date> values) {
            addCriterionForJDBCDate("founded_at in", values, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andFoundedAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("founded_at not in", values, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andFoundedAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("founded_at between", value1, value2, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andFoundedAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("founded_at not between", value1, value2, "foundedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtIsNull() {
            addCriterion("closed_at is null");
            return (Criteria) this;
        }

        public Criteria andClosedAtIsNotNull() {
            addCriterion("closed_at is not null");
            return (Criteria) this;
        }

        public Criteria andClosedAtEqualTo(Date value) {
            addCriterionForJDBCDate("closed_at =", value, "closedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("closed_at <>", value, "closedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtGreaterThan(Date value) {
            addCriterionForJDBCDate("closed_at >", value, "closedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("closed_at >=", value, "closedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtLessThan(Date value) {
            addCriterionForJDBCDate("closed_at <", value, "closedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("closed_at <=", value, "closedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtIn(List<Date> values) {
            addCriterionForJDBCDate("closed_at in", values, "closedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("closed_at not in", values, "closedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("closed_at between", value1, value2, "closedAt");
            return (Criteria) this;
        }

        public Criteria andClosedAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("closed_at not between", value1, value2, "closedAt");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlIsNull() {
            addCriterion("homepage_url is null");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlIsNotNull() {
            addCriterion("homepage_url is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlEqualTo(String value) {
            addCriterion("homepage_url =", value, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlNotEqualTo(String value) {
            addCriterion("homepage_url <>", value, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlGreaterThan(String value) {
            addCriterion("homepage_url >", value, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("homepage_url >=", value, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlLessThan(String value) {
            addCriterion("homepage_url <", value, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlLessThanOrEqualTo(String value) {
            addCriterion("homepage_url <=", value, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlLike(String value) {
            addCriterion("homepage_url like", value, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlNotLike(String value) {
            addCriterion("homepage_url not like", value, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlIn(List<String> values) {
            addCriterion("homepage_url in", values, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlNotIn(List<String> values) {
            addCriterion("homepage_url not in", values, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlBetween(String value1, String value2) {
            addCriterion("homepage_url between", value1, value2, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andHomepageUrlNotBetween(String value1, String value2) {
            addCriterion("homepage_url not between", value1, value2, "homepageUrl");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameIsNull() {
            addCriterion("twitter_username is null");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameIsNotNull() {
            addCriterion("twitter_username is not null");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameEqualTo(String value) {
            addCriterion("twitter_username =", value, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameNotEqualTo(String value) {
            addCriterion("twitter_username <>", value, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameGreaterThan(String value) {
            addCriterion("twitter_username >", value, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("twitter_username >=", value, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameLessThan(String value) {
            addCriterion("twitter_username <", value, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameLessThanOrEqualTo(String value) {
            addCriterion("twitter_username <=", value, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameLike(String value) {
            addCriterion("twitter_username like", value, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameNotLike(String value) {
            addCriterion("twitter_username not like", value, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameIn(List<String> values) {
            addCriterion("twitter_username in", values, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameNotIn(List<String> values) {
            addCriterion("twitter_username not in", values, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameBetween(String value1, String value2) {
            addCriterion("twitter_username between", value1, value2, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andTwitterUsernameNotBetween(String value1, String value2) {
            addCriterion("twitter_username not between", value1, value2, "twitterUsername");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoWidthIsNull() {
            addCriterion("logo_width is null");
            return (Criteria) this;
        }

        public Criteria andLogoWidthIsNotNull() {
            addCriterion("logo_width is not null");
            return (Criteria) this;
        }

        public Criteria andLogoWidthEqualTo(Integer value) {
            addCriterion("logo_width =", value, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoWidthNotEqualTo(Integer value) {
            addCriterion("logo_width <>", value, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoWidthGreaterThan(Integer value) {
            addCriterion("logo_width >", value, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("logo_width >=", value, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoWidthLessThan(Integer value) {
            addCriterion("logo_width <", value, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoWidthLessThanOrEqualTo(Integer value) {
            addCriterion("logo_width <=", value, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoWidthIn(List<Integer> values) {
            addCriterion("logo_width in", values, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoWidthNotIn(List<Integer> values) {
            addCriterion("logo_width not in", values, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoWidthBetween(Integer value1, Integer value2) {
            addCriterion("logo_width between", value1, value2, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("logo_width not between", value1, value2, "logoWidth");
            return (Criteria) this;
        }

        public Criteria andLogoHeightIsNull() {
            addCriterion("logo_height is null");
            return (Criteria) this;
        }

        public Criteria andLogoHeightIsNotNull() {
            addCriterion("logo_height is not null");
            return (Criteria) this;
        }

        public Criteria andLogoHeightEqualTo(Integer value) {
            addCriterion("logo_height =", value, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andLogoHeightNotEqualTo(Integer value) {
            addCriterion("logo_height <>", value, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andLogoHeightGreaterThan(Integer value) {
            addCriterion("logo_height >", value, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andLogoHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("logo_height >=", value, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andLogoHeightLessThan(Integer value) {
            addCriterion("logo_height <", value, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andLogoHeightLessThanOrEqualTo(Integer value) {
            addCriterion("logo_height <=", value, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andLogoHeightIn(List<Integer> values) {
            addCriterion("logo_height in", values, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andLogoHeightNotIn(List<Integer> values) {
            addCriterion("logo_height not in", values, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andLogoHeightBetween(Integer value1, Integer value2) {
            addCriterion("logo_height between", value1, value2, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andLogoHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("logo_height not between", value1, value2, "logoHeight");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionIsNull() {
            addCriterion("short_description is null");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionIsNotNull() {
            addCriterion("short_description is not null");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionEqualTo(String value) {
            addCriterion("short_description =", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotEqualTo(String value) {
            addCriterion("short_description <>", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionGreaterThan(String value) {
            addCriterion("short_description >", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("short_description >=", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionLessThan(String value) {
            addCriterion("short_description <", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionLessThanOrEqualTo(String value) {
            addCriterion("short_description <=", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionLike(String value) {
            addCriterion("short_description like", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotLike(String value) {
            addCriterion("short_description not like", value, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionIn(List<String> values) {
            addCriterion("short_description in", values, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotIn(List<String> values) {
            addCriterion("short_description not in", values, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionBetween(String value1, String value2) {
            addCriterion("short_description between", value1, value2, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andShortDescriptionNotBetween(String value1, String value2) {
            addCriterion("short_description not between", value1, value2, "shortDescription");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTagListIsNull() {
            addCriterion("tag_list is null");
            return (Criteria) this;
        }

        public Criteria andTagListIsNotNull() {
            addCriterion("tag_list is not null");
            return (Criteria) this;
        }

        public Criteria andTagListEqualTo(String value) {
            addCriterion("tag_list =", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListNotEqualTo(String value) {
            addCriterion("tag_list <>", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListGreaterThan(String value) {
            addCriterion("tag_list >", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListGreaterThanOrEqualTo(String value) {
            addCriterion("tag_list >=", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListLessThan(String value) {
            addCriterion("tag_list <", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListLessThanOrEqualTo(String value) {
            addCriterion("tag_list <=", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListLike(String value) {
            addCriterion("tag_list like", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListNotLike(String value) {
            addCriterion("tag_list not like", value, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListIn(List<String> values) {
            addCriterion("tag_list in", values, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListNotIn(List<String> values) {
            addCriterion("tag_list not in", values, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListBetween(String value1, String value2) {
            addCriterion("tag_list between", value1, value2, "tagList");
            return (Criteria) this;
        }

        public Criteria andTagListNotBetween(String value1, String value2) {
            addCriterion("tag_list not between", value1, value2, "tagList");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNull() {
            addCriterion("state_code is null");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNotNull() {
            addCriterion("state_code is not null");
            return (Criteria) this;
        }

        public Criteria andStateCodeEqualTo(String value) {
            addCriterion("state_code =", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotEqualTo(String value) {
            addCriterion("state_code <>", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThan(String value) {
            addCriterion("state_code >", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("state_code >=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThan(String value) {
            addCriterion("state_code <", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThanOrEqualTo(String value) {
            addCriterion("state_code <=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLike(String value) {
            addCriterion("state_code like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotLike(String value) {
            addCriterion("state_code not like", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIn(List<String> values) {
            addCriterion("state_code in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotIn(List<String> values) {
            addCriterion("state_code not in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeBetween(String value1, String value2) {
            addCriterion("state_code between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotBetween(String value1, String value2) {
            addCriterion("state_code not between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtIsNull() {
            addCriterion("first_investment_at is null");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtIsNotNull() {
            addCriterion("first_investment_at is not null");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtEqualTo(Date value) {
            addCriterionForJDBCDate("first_investment_at =", value, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("first_investment_at <>", value, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtGreaterThan(Date value) {
            addCriterionForJDBCDate("first_investment_at >", value, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_investment_at >=", value, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtLessThan(Date value) {
            addCriterionForJDBCDate("first_investment_at <", value, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_investment_at <=", value, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtIn(List<Date> values) {
            addCriterionForJDBCDate("first_investment_at in", values, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("first_investment_at not in", values, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_investment_at between", value1, value2, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andFirstInvestmentAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_investment_at not between", value1, value2, "firstInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtIsNull() {
            addCriterion("last_investment_at is null");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtIsNotNull() {
            addCriterion("last_investment_at is not null");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtEqualTo(Date value) {
            addCriterionForJDBCDate("last_investment_at =", value, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_investment_at <>", value, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtGreaterThan(Date value) {
            addCriterionForJDBCDate("last_investment_at >", value, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_investment_at >=", value, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtLessThan(Date value) {
            addCriterionForJDBCDate("last_investment_at <", value, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_investment_at <=", value, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtIn(List<Date> values) {
            addCriterionForJDBCDate("last_investment_at in", values, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_investment_at not in", values, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_investment_at between", value1, value2, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andLastInvestmentAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_investment_at not between", value1, value2, "lastInvestmentAt");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsIsNull() {
            addCriterion("investment_rounds is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsIsNotNull() {
            addCriterion("investment_rounds is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsEqualTo(Integer value) {
            addCriterion("investment_rounds =", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsNotEqualTo(Integer value) {
            addCriterion("investment_rounds <>", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsGreaterThan(Integer value) {
            addCriterion("investment_rounds >", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsGreaterThanOrEqualTo(Integer value) {
            addCriterion("investment_rounds >=", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsLessThan(Integer value) {
            addCriterion("investment_rounds <", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsLessThanOrEqualTo(Integer value) {
            addCriterion("investment_rounds <=", value, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsIn(List<Integer> values) {
            addCriterion("investment_rounds in", values, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsNotIn(List<Integer> values) {
            addCriterion("investment_rounds not in", values, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsBetween(Integer value1, Integer value2) {
            addCriterion("investment_rounds between", value1, value2, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestmentRoundsNotBetween(Integer value1, Integer value2) {
            addCriterion("investment_rounds not between", value1, value2, "investmentRounds");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesIsNull() {
            addCriterion("invested_companies is null");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesIsNotNull() {
            addCriterion("invested_companies is not null");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesEqualTo(Integer value) {
            addCriterion("invested_companies =", value, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesNotEqualTo(Integer value) {
            addCriterion("invested_companies <>", value, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesGreaterThan(Integer value) {
            addCriterion("invested_companies >", value, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesGreaterThanOrEqualTo(Integer value) {
            addCriterion("invested_companies >=", value, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesLessThan(Integer value) {
            addCriterion("invested_companies <", value, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesLessThanOrEqualTo(Integer value) {
            addCriterion("invested_companies <=", value, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesIn(List<Integer> values) {
            addCriterion("invested_companies in", values, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesNotIn(List<Integer> values) {
            addCriterion("invested_companies not in", values, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesBetween(Integer value1, Integer value2) {
            addCriterion("invested_companies between", value1, value2, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andInvestedCompaniesNotBetween(Integer value1, Integer value2) {
            addCriterion("invested_companies not between", value1, value2, "investedCompanies");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtIsNull() {
            addCriterion("first_funding_at is null");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtIsNotNull() {
            addCriterion("first_funding_at is not null");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtEqualTo(Date value) {
            addCriterionForJDBCDate("first_funding_at =", value, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("first_funding_at <>", value, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtGreaterThan(Date value) {
            addCriterionForJDBCDate("first_funding_at >", value, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_funding_at >=", value, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtLessThan(Date value) {
            addCriterionForJDBCDate("first_funding_at <", value, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_funding_at <=", value, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtIn(List<Date> values) {
            addCriterionForJDBCDate("first_funding_at in", values, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("first_funding_at not in", values, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_funding_at between", value1, value2, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andFirstFundingAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_funding_at not between", value1, value2, "firstFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtIsNull() {
            addCriterion("last_funding_at is null");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtIsNotNull() {
            addCriterion("last_funding_at is not null");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtEqualTo(Date value) {
            addCriterionForJDBCDate("last_funding_at =", value, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_funding_at <>", value, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtGreaterThan(Date value) {
            addCriterionForJDBCDate("last_funding_at >", value, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_funding_at >=", value, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtLessThan(Date value) {
            addCriterionForJDBCDate("last_funding_at <", value, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_funding_at <=", value, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtIn(List<Date> values) {
            addCriterionForJDBCDate("last_funding_at in", values, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_funding_at not in", values, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_funding_at between", value1, value2, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andLastFundingAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_funding_at not between", value1, value2, "lastFundingAt");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsIsNull() {
            addCriterion("funding_rounds is null");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsIsNotNull() {
            addCriterion("funding_rounds is not null");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsEqualTo(Integer value) {
            addCriterion("funding_rounds =", value, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsNotEqualTo(Integer value) {
            addCriterion("funding_rounds <>", value, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsGreaterThan(Integer value) {
            addCriterion("funding_rounds >", value, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsGreaterThanOrEqualTo(Integer value) {
            addCriterion("funding_rounds >=", value, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsLessThan(Integer value) {
            addCriterion("funding_rounds <", value, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsLessThanOrEqualTo(Integer value) {
            addCriterion("funding_rounds <=", value, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsIn(List<Integer> values) {
            addCriterion("funding_rounds in", values, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsNotIn(List<Integer> values) {
            addCriterion("funding_rounds not in", values, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsBetween(Integer value1, Integer value2) {
            addCriterion("funding_rounds between", value1, value2, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingRoundsNotBetween(Integer value1, Integer value2) {
            addCriterion("funding_rounds not between", value1, value2, "fundingRounds");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdIsNull() {
            addCriterion("funding_total_usd is null");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdIsNotNull() {
            addCriterion("funding_total_usd is not null");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdEqualTo(Long value) {
            addCriterion("funding_total_usd =", value, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdNotEqualTo(Long value) {
            addCriterion("funding_total_usd <>", value, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdGreaterThan(Long value) {
            addCriterion("funding_total_usd >", value, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdGreaterThanOrEqualTo(Long value) {
            addCriterion("funding_total_usd >=", value, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdLessThan(Long value) {
            addCriterion("funding_total_usd <", value, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdLessThanOrEqualTo(Long value) {
            addCriterion("funding_total_usd <=", value, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdIn(List<Long> values) {
            addCriterion("funding_total_usd in", values, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdNotIn(List<Long> values) {
            addCriterion("funding_total_usd not in", values, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdBetween(Long value1, Long value2) {
            addCriterion("funding_total_usd between", value1, value2, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFundingTotalUsdNotBetween(Long value1, Long value2) {
            addCriterion("funding_total_usd not between", value1, value2, "fundingTotalUsd");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtIsNull() {
            addCriterion("first_milestone_at is null");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtIsNotNull() {
            addCriterion("first_milestone_at is not null");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtEqualTo(Date value) {
            addCriterionForJDBCDate("first_milestone_at =", value, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("first_milestone_at <>", value, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtGreaterThan(Date value) {
            addCriterionForJDBCDate("first_milestone_at >", value, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_milestone_at >=", value, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtLessThan(Date value) {
            addCriterionForJDBCDate("first_milestone_at <", value, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("first_milestone_at <=", value, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtIn(List<Date> values) {
            addCriterionForJDBCDate("first_milestone_at in", values, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("first_milestone_at not in", values, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_milestone_at between", value1, value2, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andFirstMilestoneAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("first_milestone_at not between", value1, value2, "firstMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtIsNull() {
            addCriterion("last_milestone_at is null");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtIsNotNull() {
            addCriterion("last_milestone_at is not null");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtEqualTo(Date value) {
            addCriterionForJDBCDate("last_milestone_at =", value, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_milestone_at <>", value, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtGreaterThan(Date value) {
            addCriterionForJDBCDate("last_milestone_at >", value, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_milestone_at >=", value, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtLessThan(Date value) {
            addCriterionForJDBCDate("last_milestone_at <", value, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_milestone_at <=", value, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtIn(List<Date> values) {
            addCriterionForJDBCDate("last_milestone_at in", values, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_milestone_at not in", values, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_milestone_at between", value1, value2, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andLastMilestoneAtNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_milestone_at not between", value1, value2, "lastMilestoneAt");
            return (Criteria) this;
        }

        public Criteria andMilestonesIsNull() {
            addCriterion("milestones is null");
            return (Criteria) this;
        }

        public Criteria andMilestonesIsNotNull() {
            addCriterion("milestones is not null");
            return (Criteria) this;
        }

        public Criteria andMilestonesEqualTo(Integer value) {
            addCriterion("milestones =", value, "milestones");
            return (Criteria) this;
        }

        public Criteria andMilestonesNotEqualTo(Integer value) {
            addCriterion("milestones <>", value, "milestones");
            return (Criteria) this;
        }

        public Criteria andMilestonesGreaterThan(Integer value) {
            addCriterion("milestones >", value, "milestones");
            return (Criteria) this;
        }

        public Criteria andMilestonesGreaterThanOrEqualTo(Integer value) {
            addCriterion("milestones >=", value, "milestones");
            return (Criteria) this;
        }

        public Criteria andMilestonesLessThan(Integer value) {
            addCriterion("milestones <", value, "milestones");
            return (Criteria) this;
        }

        public Criteria andMilestonesLessThanOrEqualTo(Integer value) {
            addCriterion("milestones <=", value, "milestones");
            return (Criteria) this;
        }

        public Criteria andMilestonesIn(List<Integer> values) {
            addCriterion("milestones in", values, "milestones");
            return (Criteria) this;
        }

        public Criteria andMilestonesNotIn(List<Integer> values) {
            addCriterion("milestones not in", values, "milestones");
            return (Criteria) this;
        }

        public Criteria andMilestonesBetween(Integer value1, Integer value2) {
            addCriterion("milestones between", value1, value2, "milestones");
            return (Criteria) this;
        }

        public Criteria andMilestonesNotBetween(Integer value1, Integer value2) {
            addCriterion("milestones not between", value1, value2, "milestones");
            return (Criteria) this;
        }

        public Criteria andRelationshipsIsNull() {
            addCriterion("relationships is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipsIsNotNull() {
            addCriterion("relationships is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipsEqualTo(Integer value) {
            addCriterion("relationships =", value, "relationships");
            return (Criteria) this;
        }

        public Criteria andRelationshipsNotEqualTo(Integer value) {
            addCriterion("relationships <>", value, "relationships");
            return (Criteria) this;
        }

        public Criteria andRelationshipsGreaterThan(Integer value) {
            addCriterion("relationships >", value, "relationships");
            return (Criteria) this;
        }

        public Criteria andRelationshipsGreaterThanOrEqualTo(Integer value) {
            addCriterion("relationships >=", value, "relationships");
            return (Criteria) this;
        }

        public Criteria andRelationshipsLessThan(Integer value) {
            addCriterion("relationships <", value, "relationships");
            return (Criteria) this;
        }

        public Criteria andRelationshipsLessThanOrEqualTo(Integer value) {
            addCriterion("relationships <=", value, "relationships");
            return (Criteria) this;
        }

        public Criteria andRelationshipsIn(List<Integer> values) {
            addCriterion("relationships in", values, "relationships");
            return (Criteria) this;
        }

        public Criteria andRelationshipsNotIn(List<Integer> values) {
            addCriterion("relationships not in", values, "relationships");
            return (Criteria) this;
        }

        public Criteria andRelationshipsBetween(Integer value1, Integer value2) {
            addCriterion("relationships between", value1, value2, "relationships");
            return (Criteria) this;
        }

        public Criteria andRelationshipsNotBetween(Integer value1, Integer value2) {
            addCriterion("relationships not between", value1, value2, "relationships");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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