package com.lkf.ttshop.dao;

import com.lkf.ttshop.pojo.po.Rpuser;
import com.lkf.ttshop.pojo.po.RpuserExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface RpuserMapper {
    int countByExample(RpuserExample example);

    int deleteByExample(RpuserExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Rpuser record);

    int insertSelective(Rpuser record);

    List<Rpuser> selectByExample(RpuserExample example);

    Rpuser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Rpuser record, @Param("example") RpuserExample example);

    int updateByExample(@Param("record") Rpuser record, @Param("example") RpuserExample example);

    int updateByPrimaryKeySelective(Rpuser record);

    int updateByPrimaryKey(Rpuser record);
}