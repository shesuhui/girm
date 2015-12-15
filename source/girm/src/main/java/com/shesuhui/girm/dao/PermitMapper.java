package com.shesuhui.girm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.shesuhui.girm.model.Permit;


@Repository
public interface PermitMapper {

    public void addPermit(Permit permit);

    public List<Permit> getPermitByRid(@Param(value = "roleid") String roleid);

}
