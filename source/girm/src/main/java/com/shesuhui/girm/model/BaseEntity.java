package com.shesuhui.girm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 项目名称：girm 类名称：BaseModel 类描述：
 * 
 * @author：shesuhui 创建时间：2015年12月2日 下午3:10:19
 * @version 1.0 领域模型的抽象类
 * 
 */
public class BaseEntity implements Serializable {

	protected Integer id;
	protected User creator;
	protected Date createtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
