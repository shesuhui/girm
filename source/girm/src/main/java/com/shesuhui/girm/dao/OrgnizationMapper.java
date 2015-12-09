package com.shesuhui.girm.dao;

import com.shesuhui.girm.model.Orgnization;

public interface OrgnizationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orgnization record);

    int insertSelective(Orgnization record);

    Orgnization selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orgnization record);

    int updateByPrimaryKey(Orgnization record);
}