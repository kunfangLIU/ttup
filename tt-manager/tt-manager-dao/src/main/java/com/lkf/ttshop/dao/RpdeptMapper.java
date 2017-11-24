package com.lkf.ttshop.dao;

import com.lkf.ttshop.pojo.po.Rpdept;
import com.lkf.ttshop.pojo.po.RpdeptExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RpdeptMapper {
    int countByExample(RpdeptExample example);

    int deleteByExample(RpdeptExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Rpdept record);

    int insertSelective(Rpdept record);

    List<Rpdept> selectByExample(RpdeptExample example);

    Rpdept selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Rpdept record, @Param("example") RpdeptExample example);

    int updateByExample(@Param("record") Rpdept record, @Param("example") RpdeptExample example);

    int updateByPrimaryKeySelective(Rpdept record);

    int updateByPrimaryKey(Rpdept record);
}