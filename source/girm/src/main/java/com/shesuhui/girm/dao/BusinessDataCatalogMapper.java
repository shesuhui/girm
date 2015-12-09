package com.shesuhui.girm.dao;

import com.shesuhui.girm.model.DataCatalog;

public interface BusinessDataCatalogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataCatalog record);

    int insertSelective(DataCatalog record);

    DataCatalog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DataCatalog record);

    int updateByPrimaryKey(DataCatalog record);
}