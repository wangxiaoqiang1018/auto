package com.wxq.test;


import java.time.LocalDate;

/**
 * @author wangxiaoqiang
 * @date 2020/5/14 9:47
 * @description
 */

public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private LocalDate birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void run(){
        System.out.println("运行run方法");
    }
}
