package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName RequestController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/19 09:24
 **/
@RestController
public class RequestController {

    @GetMapping("/goto")
    public String gotoType(HttpServletRequest request){
        request.setAttribute("msg","成功了....");
        request.setAttribute("code",200);
        return "forward:/success"; //转发到 /success请求
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg") String msg,
                          @RequestAttribute("code")Integer code,
                          HttpServletRequest request){
        Object msg1 = request.getAttribute("msg");
        Map<String,Object> map=new HashMap<>();
        map.put("reqMethod_msg",msg1);
        map.put("annotation_msg",msg);

        return map;
    }

    //1.语法 cars/sell;low=34;brand=byd,audi,yd
    //2.Springboot默认禁用了矩形变量的功能
    //   手动开启: 原理 对于路径的处理 UrlPathHelper进行解析
    //                removeSemicolonContent (移除分号内容)支持矩阵变量的
    //3.矩阵变量必须有url路径变量才能被解析
    @GetMapping("/cars/{path}")
    public Map careSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand") List<String> brand,
                        @PathVariable("path") String path){
        Map<String,Object> map=new HashMap<>();
        map.put("low",low);
        map.put("brand",brand);
        map.put("path",path);
        return map;
    }
    ///boss/1;age=20/2;age=10

    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,
                    @MatrixVariable(value = "age",pathVar = "empId") Integer empAge){
        Map<String,Object> map=new HashMap<>();
        map.put("bossAge",bossAge);
        map.put("empAge",empAge);
        return map;
    }
}
