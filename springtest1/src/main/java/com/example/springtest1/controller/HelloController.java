package com.example.springtest1.controller;

//请求处理类
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello !!!");
        return "Hello !!!";
    }
}
