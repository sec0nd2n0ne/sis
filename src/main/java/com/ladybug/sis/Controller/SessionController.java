package com.ladybug.sis.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SIS")
public class SessionController {

    @RequestMapping()
    public String homePage(){
        return "home";
    }
}

