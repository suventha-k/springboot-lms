package com.SGIC.LMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class rest {

    @GetMapping("/get")
    public String get(){
        return "run";
    }

    @GetMapping("/run")
    public String kill(){
        return "run";
    }
}
