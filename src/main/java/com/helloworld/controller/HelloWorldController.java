package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
@GetMapping("helloWorld")
public String helloWorld()
{
return "Hello World !!!";
}

    @GetMapping("helloSpring")
    public String helloSpring()
    {
        return "Hello Spring !!!";
    }
}
