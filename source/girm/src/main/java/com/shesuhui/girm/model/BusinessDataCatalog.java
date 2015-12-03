package com.shesuhui.girm.model;

import java.awt.Component;
import java.util.Date;

/**  
*   
* 项目名称：girm  
* 类名称：BusinessData  
* 类描述：  
* @author：shesuhui 
* 创建时间：2015年12月2日 下午2:33:41  
* @version 1.0
* 业务数据目录的领域模型
*   
*/ 
public class BusinessDataCatalog extends BaseModel {

	/**
	 * 
	 * 业务编码
	 */
	private String code;
	
	/**
	 * 英文名称
	 */
	private String name;
	/**
	 * 中文名称
	 */
	private String name_cn;
	/**
	 * 业务摘要
	 */
	private String summary;
	
	/**
	 * 提供单位  
	 * @see AbstractOrgnization;
	 */
	private AbstractOrgnization providerOrg;
	
	/**
	 * 发布日期
	 */
	private Date  publishDate;
	
	
}
