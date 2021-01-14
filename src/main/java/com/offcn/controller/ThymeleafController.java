package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {
    @RequestMapping("first")
    public  String first(Model model){
        model.addAttribute("date",new Date());
        return "index.html";
    }

    @RequestMapping("second")
    public  String second(Model model){
        model.addAttribute("num",3.1415926);
        return "index.html";
    }

    @RequestMapping("third")
    public  String third(Model model){
        model.addAttribute("str","当地应季水果也很好吃撒，前一阵红心柚子又甜又清凉，最近耙耙柑和甘蔗，过一阵应该是冬枣，再有几个月是最喜欢的枇杷，夏天的菠萝哈密瓜葡萄红提等等 太多啦，没有冷链运输，健康安全，十块钱三斤，有时晚一点或者天气不好 五块钱三斤也很常见。");
        return "index.html";
    }
}
