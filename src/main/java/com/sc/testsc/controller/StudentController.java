package com.sc.testsc.controller;

import com.sc.testsc.common.Result;
import com.sc.testsc.entity.StudentEntity;
import com.sc.testsc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value="/queryByParam")
    public Result queryByParam(){
       List<StudentEntity> list =  studentService.queryStudentByParam();
       return  Result.success(list);
    }
}
