package com.wxq.test;

import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;

import java.lang.reflect.Field;

/**
 * @author wangxiaoqiang
 * @date 2020/5/14 9:02
 * @description
 */

public class TestUtils {
    public static void main(String[] args) {
        Field[] fields = ReflectUtil.getFields(Person.class);
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println(field.getDeclaredAnnotations());
        }


    }
}
