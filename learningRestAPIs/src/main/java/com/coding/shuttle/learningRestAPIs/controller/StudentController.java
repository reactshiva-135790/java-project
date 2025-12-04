package com.coding.shuttle.learningRestAPIs.controller;
import com.coding.shuttle.learningRestAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(4L, "Shiva", "shivamaurya838@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById() {
        return new StudentDto(4L, "Shiva", "shivamaurya838@gmail.com");
    }


}