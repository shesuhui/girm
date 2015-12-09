package com.shesuhui.girm.model;

import java.util.Date;

public class DataCatalog extends BusinessEntity {

	private Integer providerOrg;
	private Date publishDate;
	private String summary;
	private String remark;

	public DataCatalog() {
		super();
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

}