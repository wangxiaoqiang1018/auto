package com.wxq.auto.service;

import com.wxq.auto.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wxq
 * @since 2020-04-08
 */
public interface StudentService extends IService<Student> {
    List<Student> findAll();
}
