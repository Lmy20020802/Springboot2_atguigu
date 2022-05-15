package com.atguigu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName WorldController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/15 13:10
 **/
@RestController
public class WorldController {

    @RequestMapping("/w")
    public String world66() {
        return "World";
    }
}
