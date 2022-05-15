package com.atguigu.boot.controller;


import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ParameterTestController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/19 08:44
 **/

@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age") Integer age,
                                     @RequestParam("inters")List<String> inters,
                                     @RequestParam Map<String,String> params,
                                     @CookieValue("Idea-6833a9ba") String _ga,
                                     @CookieValue("Idea-6833a9ba") Cookie cookie
    ){
        Map<String,Object> map=new HashMap<>();
//        map.put("id",id);
//        map.put("name",name);
//        map.put("pv",pv);
//        map.put("userAgent",userAgent);
//        map.put("headers",header);
        map.put("age",age);
        map.put("inters",inters);
        map.put("params",params);
        map.put("Idea-6833a9ba",_ga);
        System.out.println(cookie);
        return map;
    }

    @PostMapping("/save")
    public Map postMetho(@RequestBody String content){
        Map<String,Object> map=new HashMap<>();
        map.put("content",content);
        return map;
    }
}
