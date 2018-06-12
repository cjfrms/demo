package com.geuni.demo.controller;

import com.geuni.demo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @Autowired
    SampleService sampleService;

    @GetMapping("/sample")
    @ResponseBody
    public String getSample(){
        return sampleService.getAll().toString();
    }
}
