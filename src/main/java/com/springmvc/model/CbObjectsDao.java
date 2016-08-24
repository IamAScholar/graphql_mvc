package com.springmvc.model;

import java.util.Date;

public class CbObjectsDao {
    private String id;

    private String entityType;

    private Long entityId;

    private String parentId;

    private String name;

    private String normalizedName;

    private String permalink;

    private String categoryCode;

    private String status;

    private Date foundedAt;

    private Date closedAt;

    private String domain;

    private String homepageUrl;

    private String twitterUsername;

    private String logoUrl;

    private Integer logoWidth;

    private Integer logoHeight;

    private String shortDescription;

    private String description;

    private String tagList;

    private String countryCode;

    private String stateCode;

    private String city;

    private String region;

    private Date firstInvestmentAt;

    private Date lastInvestmentAt;

    private Integer investmentRounds;

    private Integer investedCompanies;

    private Date firstFundingAt;

    private Date lastFundingAt;

    private Integer fundingRounds;

    private Long fundingTotalUsd;

    private Date firstMilestoneAt;

    private Date lastMilestoneAt;

    private Integer milestones;

    private Integer relationships;

    private String createdBy;

    private Date createdAt;

    private Date updatedAt;

    private String overview;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType == null ? null : entityType.trim();
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNormalizedName() {
        return normalizedName;
    }

    public void setNormalizedName(String normalizedName) {
        this.normalizedName = normalizedName == null ? null : normalizedName.trim();
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink == null ? null : permalink.trim();
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getFoundedAt() {
        return foundedAt;
    }

    public void setFoundedAt(Date foundedAt) {
        this.foundedAt = foundedAt;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl == null ? null : homepageUrl.trim();
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername == null ? null : twitterUsername.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public Integer getLogoWidth() {
        return logoWidth;
    }

    public void setLogoWidth(Integer logoWidth) {
        this.logoWidth = logoWidth;
    }

    public Integer getLogoHeight() {
        return logoHeight;
    }

    public void setLogoHeight(Integer logoHeight) {
        this.logoHeight = logoHeight;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription == null ? null : shortDescription.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList == null ? null : tagList.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode == null ? null : stateCode.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Date getFirstInvestmentAt() {
        return firstInvestmentAt;
    }

    public void setFirstInvestmentAt(Date firstInvestmentAt) {
        this.firstInvestmentAt = firstInvestmentAt;
    }

    public Date getLastInvestmentAt() {
        return lastInvestmentAt;
    }

    public void setLastInvestmentAt(Date lastInvestmentAt) {
        this.lastInvestmentAt = lastInvestmentAt;
    }

    public Integer getInvestmentRounds() {
        return investmentRounds;
    }

    public void setInvestmentRounds(Integer investmentRounds) {
        this.investmentRounds = investmentRounds;
    }

    public Integer getInvestedCompanies() {
        return investedCompanies;
    }

    public void setInvestedCompanies(Integer investedCompanies) {
        this.investedCompanies = investedCompanies;
    }

    public Date getFirstFundingAt() {
        return firstFundingAt;
    }

    public void setFirstFundingAt(Date firstFundingAt) {
        this.firstFundingAt = firstFundingAt;
    }

    public Date getLastFundingAt() {
        return lastFundingAt;
    }

    public void setLastFundingAt(Date lastFundingAt) {
        this.lastFundingAt = lastFundingAt;
    }

    public Integer getFundingRounds() {
        return fundingRounds;
    }

    public void setFundingRounds(Integer fundingRounds) {
        this.fundingRounds = fundingRounds;
    }

    public Long getFundingTotalUsd() {
        return fundingTotalUsd;
    }

    public void setFundingTotalUsd(Long fundingTotalUsd) {
        this.fundingTotalUsd = fundingTotalUsd;
    }

    public Date getFirstMilestoneAt() {
        return firstMilestoneAt;
    }

    public void setFirstMilestoneAt(Date firstMilestoneAt) {
        this.firstMilestoneAt = firstMilestoneAt;
    }

    public Date getLastMilestoneAt() {
        return lastMilestoneAt;
    }

    public void setLastMilestoneAt(Date lastMilestoneAt) {
        this.lastMilestoneAt = lastMilestoneAt;
    }

    public Integer getMilestones() {
        return milestones;
    }

    public void setMilestones(Integer milestones) {
        this.milestones = milestones;
    }

    public Integer getRelationships() {
        return relationships;
    }

    public void setRelationships(Integer relationships) {
        this.relationships = relationships;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }
}