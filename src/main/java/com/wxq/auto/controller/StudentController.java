package com.wxq.auto.controller;


import com.wxq.auto.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wxq
 * @since 2020-04-08
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("findAll")
    public Object findAll(){
        return studentService.findAll();
    }

}

