package com.shesuhui.girm.model;

import java.util.Date;

public class ResourceDataCatalog {
    private Integer id;

    private Integer creator;

    private Date createtime;

    private String code;

    private String name;

    private String nameCn;

    private Integer providerOrg;

    private Date publishDate;

    private String summary;

    private String remark;

    private Integer consumeOrg;

    private String keyword;

    private Integer permissionLevel;

    private Integer busiOf;

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

    public Integer getConsumeOrg() {
        return consumeOrg;
    }

    public void setConsumeOrg(Integer consumeOrg) {
        this.consumeOrg = consumeOrg;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(Integer permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public Integer getBusiOf() {
        return busiOf;
    }

    public void setBusiOf(Integer busiOf) {
        this.busiOf = busiOf;
    }
}