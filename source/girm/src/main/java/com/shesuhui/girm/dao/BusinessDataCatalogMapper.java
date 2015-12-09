package com.shesuhui.girm.dao;

import com.shesuhui.girm.model.BaseEntity;

public interface BusinessDataCatalogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseEntity record);

    int insertSelective(BaseEntity record);

    BaseEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseEntity record);

    int updateByPrimaryKey(BaseEntity record);
}