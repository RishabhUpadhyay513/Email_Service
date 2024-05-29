package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo/api")
public class DemoController {

    @Autowired
    DemoService service;

    @GetMapping("/getEmployees")
    public List<Employees>  getAllEmployees(){
        List<Employees>  employees= service.getAllEmployee();
        System.out.println(employees);
        return employees;
    }


}
