package com.SGIC.LMS.controller;

import com.SGIC.LMS.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class APIController {

    @Autowired
    private AppService service;

    @GetMapping("/print")
    public String print(){
        return service.addinfo();
    }
}
