package com.lkf.ttshop.dao;

import com.lkf.ttshop.pojo.po.Rprole;
import com.lkf.ttshop.pojo.po.RproleExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RproleMapper {
    int countByExample(RproleExample example);

    int deleteByExample(RproleExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Rprole record);

    int insertSelective(Rprole record);

    List<Rprole> selectByExample(RproleExample example);

    Rprole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Rprole record, @Param("example") RproleExample example);

    int updateByExample(@Param("record") Rprole record, @Param("example") RproleExample example);

    int updateByPrimaryKeySelective(Rprole record);

    int updateByPrimaryKey(Rprole record);
}