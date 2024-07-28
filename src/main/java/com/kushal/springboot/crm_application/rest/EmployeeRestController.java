package com.kushal.springboot.crm_application.rest;

import com.kushal.springboot.crm_application.dao.EmployeeDAO;
import com.kushal.springboot.crm_application.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeDAO employeeDAO;


    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }

}

