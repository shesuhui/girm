package com.shesuhui.girm.dao;

import com.shesuhui.girm.model.MetaDataCatalog;

public interface MetaDataCatalogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MetaDataCatalog record);

    int insertSelective(MetaDataCatalog record);

    MetaDataCatalog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MetaDataCatalog record);

    int updateByPrimaryKey(MetaDataCatalog record);
}