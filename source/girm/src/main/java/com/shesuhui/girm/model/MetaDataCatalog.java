package com.shesuhui.girm.model;

import java.util.Date;

public class MetaDataCatalog {
    private Integer id;

    private Integer creator;

    private Date createtime;

    private String code;

    private String name;

    private String nameCn;

    private Integer providerOrg;

    private Integer consumeOrg;

    private Date publishDate;

    private String summary;

    private String remark;

    private Integer dataType;

    private String valueRange;

    private Integer resourceOf;

    private Integer shareCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn == null ? null : nameCn.trim();
    }

    public Integer getProviderOrg() {
        return providerOrg;
    }

    public void setProviderOrg(Integer providerOrg) {
        this.providerOrg = providerOrg;
    }

    public Integer getConsumeOrg() {
        return consumeOrg;
    }

    public void setConsumeOrg(Integer consumeOrg) {
        this.consumeOrg = consumeOrg;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange == null ? null : valueRange.trim();
    }

    public Integer getResourceOf() {
        return resourceOf;
    }

    public void setResourceOf(Integer resourceOf) {
        this.resourceOf = resourceOf;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }
}