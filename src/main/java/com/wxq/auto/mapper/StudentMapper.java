package com.wxq.auto.mapper;

import com.wxq.auto.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wxq
 * @since 2020-04-08
 */
public interface StudentMapper extends BaseMapper<Student> {
    List<Student> findAll();
}
