package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    DemoRepository demoRepository;

    public List<Employees> getAllEmployee(){
       List<Employees> getAll= demoRepository.findAll();
       return  getAll;
    }
}
