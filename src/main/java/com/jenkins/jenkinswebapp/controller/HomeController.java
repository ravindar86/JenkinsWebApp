package com.jenkins.jenkinswebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    /*@GetMapping
    public String hello(){
        return "Hello!!";
    }*/

    @GetMapping("/")
    public String greeting() {
        return "hello";
    }
}
