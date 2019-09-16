package com.sc.testsc.service;

import com.sc.testsc.dao.StudentMapper;
import com.sc.testsc.entity.StudentEntity;
import com.sc.testsc.entity.StudentEntityExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<StudentEntity> queryStudentByParam(){
        return  studentMapper.selectByExample(new StudentEntityExample() );
    }
}
