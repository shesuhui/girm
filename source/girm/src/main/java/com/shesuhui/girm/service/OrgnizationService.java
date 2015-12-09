package com.shesuhui.girm.service;

import java.util.List;

import com.shesuhui.girm.model.BaseEntity;
import com.shesuhui.girm.model.Orgnization;

/**  
*   
* 项目名称：girm  
* 类名称：OrgnizationService  
* 类描述：组织机构的服务类  
* @author：shesuhui 
* 创建时间：2015年12月9日 下午2:56:46  
* @version        
*/ 
public interface OrgnizationService {
	

	/**
	 * @param orgID
	 * 
	 * @return
	 * 
	 * @throws Exception
	 */
	public abstract List<Orgnization> getChildrenByID(Integer orgID) throws Exception;
	
	/**
	 * @param Level
	 * @return
	 * @throws Exception
	 */
	public abstract List<Orgnization> getChildrenByLevel(Integer Level) throws Exception;
	
	
	
	
	
	
	
	

}
