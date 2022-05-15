package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName Car
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/15 16:19
 **/

/**
 * 只有在容器中的组件,才会拥有Springboot提供的强大功能
 */
//@Component

@Data  //lombok插件
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;
    private Integer price;
}
