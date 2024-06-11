package com.nse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nse.entity.Student;
import com.nse.repository.StudentRepository;

@RestController
@RequestMapping("/")
@CrossOrigin
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping
	public void insertData(@RequestBody Student student)
	{
		studentRepository.save(student);
	}

	 @DeleteMapping("{id}")
	 public void deleteData(@PathVariable int id)
	 {
		 studentRepository.deleteById(id);
	 }
	 
	 @PutMapping
	 public void updateData(@RequestBody Student student)
	 {
		 studentRepository.save(student);
	 }
	 
	 @GetMapping
	 public List<Student> getData()
	 {
		 return studentRepository.findAll();
		 
	 }
}
