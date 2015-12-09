package com.shesuhui.girm.model;

public class BusinessEntity extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8223806129186564089L;
	
	protected String code;
	protected String name;
	protected String nameCn;

	public BusinessEntity() {
		super();
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

}