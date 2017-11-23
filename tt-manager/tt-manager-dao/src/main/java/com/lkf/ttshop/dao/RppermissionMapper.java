package com.lkf.ttshop.dao;

import com.lkf.ttshop.pojo.po.Rppermission;
import com.lkf.ttshop.pojo.po.RppermissionExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RppermissionMapper {
    int countByExample(RppermissionExample example);

    int deleteByExample(RppermissionExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Rppermission record);

    int insertSelective(Rppermission record);

    List<Rppermission> selectByExample(RppermissionExample example);

    Rppermission selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Rppermission record, @Param("example") RppermissionExample example);

    int updateByExample(@Param("record") Rppermission record, @Param("example") RppermissionExample example);

    int updateByPrimaryKeySelective(Rppermission record);

    int updateByPrimaryKey(Rppermission record);
}