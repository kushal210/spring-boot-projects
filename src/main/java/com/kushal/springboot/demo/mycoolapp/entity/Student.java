package com.kushal.springboot.demo.mycoolapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    // If we don't specify the @Column, JPA will use the default mapping rules to map to database column.
    // Entity Fields --> Database Column [camelCase --> snake_case],
    // Default filed is nullable

    // define fields.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    // Default mapping -> camelCase to snake_case.
    private String lastName;

    @Column(name = "email")
    private String email;

    // define constructor.
    // defining a no-arg constructor is mandatory for JPA to initialize the entity object.
    public Student(){

    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // define getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // define toString()

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
