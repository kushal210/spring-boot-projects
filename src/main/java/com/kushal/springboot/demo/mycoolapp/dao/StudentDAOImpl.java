package com.kushal.springboot.demo.mycoolapp.dao;

import com.kushal.springboot.demo.mycoolapp.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager.
    @Autowired
    private EntityManager entityManager;

    // inject entity manager using constructor injection.
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional  // To allow transactional behavoiur on the save method.
    public void save(Student student) {
        entityManager.persist(student);
    }
}
