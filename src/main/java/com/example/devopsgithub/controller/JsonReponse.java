package com.example.devopsgithub.controller;

import com.example.devopsgithub.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonReponse {

    @GetMapping("/student")
    public Student myStudent() {
        Student student = new Student("Alex", "Male", 21);
        return student;
    }

}
