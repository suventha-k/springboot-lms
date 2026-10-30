package com.SGIC.LMS.service;

import com.SGIC.LMS.entity.Studententity;
import com.SGIC.LMS.repositoty.StudentRepoci;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepoci reposit;

    public Studententity savestudent(Studententity Studententity) {
        return reposit.save(Studententity);
    }
    public List<Studententity> getallstudents() {
        return reposit.findAll();
    }
    public Studententity getstudentbyid(Long id){
        return reposit.findById(id)
                .orElseThrow(() -> new RuntimeException("student not found" + id));
    }
    public void deletestudent(Long id) {
        Studententity student = reposit.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Student not found with ID: " + id));

        reposit.delete(student);
    }
}
