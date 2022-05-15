package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/15 13:34
 **/
@Data
//@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;
    private Pet pet;


    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


}
