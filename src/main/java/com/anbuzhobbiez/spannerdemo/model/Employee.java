package com.anbuzhobbiez.spannerdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Table(name = "employee")
@Data
@AllArgsConstructor
public class Employee {
   // @PrimaryKey
    private String id;
    private String name;
}
