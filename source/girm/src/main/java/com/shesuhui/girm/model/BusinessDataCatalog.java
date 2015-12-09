package com.shesuhui.girm.model;

import java.util.Date;

public class BusinessDataCatalog extends DataCatalog {
    private Integer providerOrg;

    private Date publishDate;

    private String summary;

    private String remark;

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
}