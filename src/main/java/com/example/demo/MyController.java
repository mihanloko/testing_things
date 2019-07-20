package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(method = RequestMethod.GET, value = "/get")
    public Integer getSomething(@RequestParam(value = "number", defaultValue = "3") Integer num) {

        return num * num * num;

    }

}
