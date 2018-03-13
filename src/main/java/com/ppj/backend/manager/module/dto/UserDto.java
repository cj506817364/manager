package com.ppj.backend.manager.module.dto;

import com.ppj.backend.manager.common.base.entity.BaseEntity;

import java.io.Serializable;

public class UserDto extends BaseEntity implements Serializable{
    private static final long serialVersionUID = -8081506886179213667L;

    private String name ;

    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
