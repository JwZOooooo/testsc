package com.sc.testsc.dao;

import com.sc.testsc.entity.StudentEntity;
import com.sc.testsc.entity.StudentEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {
    long countByExample(StudentEntityExample example);

    int deleteByExample(StudentEntityExample example);

    int insert(StudentEntity record);

    int insertSelective(StudentEntity record);

    List<StudentEntity> selectByExample(StudentEntityExample example);

    int updateByExampleSelective(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);

    int updateByExample(@Param("record") StudentEntity record, @Param("example") StudentEntityExample example);
}