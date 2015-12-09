package com.shesuhui.girm.model;

import java.util.Date;

public class DataCatalog {

	protected Integer id;
	protected Integer creator;
	protected Date createtime;
	protected String code;
	protected String name;
	protected String nameCn;

	public DataCatalog() {
		super();
	}

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

}