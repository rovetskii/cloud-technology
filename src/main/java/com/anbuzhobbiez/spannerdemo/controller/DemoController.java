package com.anbuzhobbiez.spannerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    //@Autowired
    //EmployeeRepository employeeRepository;

//    @GetMapping("/greet/{name}")
//    public String greet(@PathVariable String name){
//        employeeRepository.save(new Employee(
//                UUID.randomUUID().toString(),
//                name
//        ));
//        return "Hello "+name;
//    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return "Hello "+name;
    }
}
