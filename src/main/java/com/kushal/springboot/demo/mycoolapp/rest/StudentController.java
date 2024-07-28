package com.kushal.springboot.demo.mycoolapp.rest;

import com.kushal.springboot.demo.mycoolapp.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
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
        if(studentId < 0 || studentId >= studentList.size()){
            throw new StudentNotFoundException("Student id not found: " + studentId);
        }
        return studentList.get(studentId);
    }

    // Adding an exception handler using @ExceptionHandler
    @ExceptionHandler
    ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

       return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // Adding other exception handler.... to catch any exception  (catch all)
    @ExceptionHandler
    ResponseEntity<StudentErrorResponse> handleException(Exception exc){
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage("Invalid Request");
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}