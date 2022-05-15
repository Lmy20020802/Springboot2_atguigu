package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName Pet
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/15 22:34
 **/
@ToString
@Data
public class Pet {
    private String name;
    private Double weight;
}
