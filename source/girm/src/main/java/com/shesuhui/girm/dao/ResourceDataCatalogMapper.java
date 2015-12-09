package com.shesuhui.girm.dao;

import com.shesuhui.girm.model.ResourceDataCatalog;

public interface ResourceDataCatalogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResourceDataCatalog record);

    int insertSelective(ResourceDataCatalog record);

    ResourceDataCatalog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResourceDataCatalog record);

    int updateByPrimaryKey(ResourceDataCatalog record);
}