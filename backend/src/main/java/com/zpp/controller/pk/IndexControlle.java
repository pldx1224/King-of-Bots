package com.zpp.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pk/")
public class IndexControlle {
    @RequestMapping("index/")
    public String index(){
        return "pk/index.html";
    }
}
