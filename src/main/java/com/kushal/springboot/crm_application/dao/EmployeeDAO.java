package com.kushal.springboot.crm_application.dao;

import com.kushal.springboot.crm_application.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
