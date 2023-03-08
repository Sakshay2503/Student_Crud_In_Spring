package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentDetails;
import com.example.demo.services.StudentServices;

@RestController
public class StudentController {
	
	@Autowired
	StudentServices services;
	
	@GetMapping("/getAll")
	public List<StudentDetails> getAll()
	{
		return services.getAll();
	}
	
	
	@PostMapping("/addstud")
	
	public String addStudennt(@RequestBody StudentDetails details)
	{
		return this.services.addstud(details);
	}
	
	
	@PostMapping("/update")
	public StudentDetails update(@RequestBody StudentDetails details)
	{
		return services.update(details);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable int id)
	{
	
		this.services.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
