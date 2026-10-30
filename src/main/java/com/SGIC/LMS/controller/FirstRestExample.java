package com.SGIC.LMS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FirstRestExample {
    @GetMapping("/hello")
    public ResponseEntity<Object> getall(){
        return ResponseEntity.ok("hello world api");
    }

    @RequestMapping("/Hello-first")
    public Map<String,String> callmethod(){
        Map<String,String> map = new HashMap<>();
        map.put("msg","hello");
        map.put("msg","hello1");
        map.put("msg","hello2");
        map.put("msg","hello3");

        return map;
    }
}
