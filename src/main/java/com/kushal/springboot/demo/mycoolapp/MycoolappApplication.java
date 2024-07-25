package com.kushal.springboot.demo.mycoolapp;

import com.kushal.springboot.demo.mycoolapp.dao.StudentDAO;
import com.kushal.springboot.demo.mycoolapp.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}


	// Inject StudentDAO into the commandLineRunner.
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);
			readStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		Student student = new Student("Kushal", "Kumar", "kushal@dtu.ac.in");
		studentDAO.save(student);
		System.out.println("Saved Student id: " + student.getId());
	}
	private Student readStudent(StudentDAO studentDAO){
		Student student = studentDAO.findById(3);
		System.out.println("Fetching student with id=3: " + student);
		System.out.println("Fetching a student with a non existent id: " + studentDAO.findById(23));
		return student;
	}

}
