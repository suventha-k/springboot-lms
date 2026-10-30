package com.SGIC.LMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class gitchange {

        @GetMapping("/get")
        public String get(){
            return "run";
        }
}
