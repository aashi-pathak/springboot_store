package com.springboot.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//gives additional context to compiler -> this is used for receiving web traffic
public class HomeController {
    @RequestMapping("/")//this method is called when this given endpoint is triggered
    public String index() {
        String viewName = getViewName(); // insert a breakpoint here, there is no file named "index"
                                         // press debug button
                                         // press step-over 2 times, you will get sourcecode of springframework ( decompiled class )
                                         // press step-into to get into a function
        return viewName; // return name of view to return in browser
    }

    private String getViewName() {
        return "index";
    }
}

// To run the application You can click on run sign
// OR
// you can go to project folder and write ./mvnw spring-boot:run
