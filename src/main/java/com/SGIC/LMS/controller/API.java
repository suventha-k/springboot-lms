package com.SGIC.LMS.controller;

import com.SGIC.LMS.entity.Studententity;
import com.SGIC.LMS.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Studententity")
public class API {
    private final StudentService service;

    @PostMapping
    public Studententity addstudent (@RequestBody Studententity Studententity){
        return service.savestudent(Studententity);
    }

    @GetMapping
    public List<Studententity> geta(){
        return service.getallstudents();
    }

    @GetMapping("/{id}")
    public Studententity getstudentbyid(@PathVariable Long id) {
        return service.getstudentbyid(id);
    }

    @DeleteMapping("/{id}")
    public String deletestudent(@PathVariable Long id){
        service.deletestudent(id);
        return "student delete successfully";
    }
}
