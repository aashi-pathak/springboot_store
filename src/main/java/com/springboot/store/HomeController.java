package com.springboot.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//gives additional context to compiler -> this is used for receiving web traffic
public class HomeController {
    @RequestMapping("/")//this method is called when this given endpoint is triggered
    public String index() {
        return "index.html"; // return name of view to return in browser
    }
}
