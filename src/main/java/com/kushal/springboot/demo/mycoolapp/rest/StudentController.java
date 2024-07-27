package com.kushal.springboot.demo.mycoolapp.rest;

import com.kushal.springboot.demo.mycoolapp.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    public List<Student> studentList = new ArrayList<>();

    @PostConstruct
    public void initializeStudents(){
        studentList.add(new Student(1, "Kushal", "Kumar"));
        studentList.add(new Student(2, "Kumar", "Abhijeet"));
        studentList.add(new Student(3, "Mona", "Ji"));

    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentList;
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return studentList.get(studentId);
    }
}