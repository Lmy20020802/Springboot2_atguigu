package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName Pet
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/15 13:34
 **/
@Data
@AllArgsConstructor //全参构造器
@NoArgsConstructor //无参构造器
@ToString
public class Pet {

    private String name;

}
