package com.example.demo.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    public String name= "anna";

    @GetMapping("/")
    public String home(){

        return "index";
    }

    public void doSomething(){
            name = "anna changed";
    }

}
