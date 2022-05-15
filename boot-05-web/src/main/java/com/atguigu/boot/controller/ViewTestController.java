package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName ViewTestController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/19 16:36
 **/
@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model)
    {
        //model中的数据会被放在请求域中 request setAttribute("a",aa)
        model.addAttribute("msg","你好atguigu");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
