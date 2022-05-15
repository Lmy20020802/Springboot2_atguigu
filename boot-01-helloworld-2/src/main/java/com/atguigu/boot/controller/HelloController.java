package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/15 22:32
 **/
@RestController
public class HelloController {

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        String userName = person.getUserName();
        System.out.println(userName);
        return person;
    }
}
