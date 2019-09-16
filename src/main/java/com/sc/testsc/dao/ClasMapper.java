package com.sc.testsc.dao;

import com.sc.testsc.entity.ClasEntity;
import com.sc.testsc.entity.ClasEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClasMapper {
    long countByExample(ClasEntityExample example);

    int deleteByExample(ClasEntityExample example);

    int insert(ClasEntity record);

    int insertSelective(ClasEntity record);

    List<ClasEntity> selectByExample(ClasEntityExample example);

    int updateByExampleSelective(@Param("record") ClasEntity record, @Param("example") ClasEntityExample example);

    int updateByExample(@Param("record") ClasEntity record, @Param("example") ClasEntityExample example);
}