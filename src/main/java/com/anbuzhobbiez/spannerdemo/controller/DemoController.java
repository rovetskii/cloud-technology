package com.anbuzhobbiez.spannerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        return "This is "+name;
    }
}
