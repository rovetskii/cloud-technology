package lbgd.edu.ua.springsimpleservicedemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResources {

    @GetMapping("resources/{name}")
    public String getName(@PathVariable String name){
        return "Hello "+ name;
    }

}
