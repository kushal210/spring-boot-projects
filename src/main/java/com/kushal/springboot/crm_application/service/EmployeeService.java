package com.kushal.springboot.crm_application.service;

import com.kushal.springboot.crm_application.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
