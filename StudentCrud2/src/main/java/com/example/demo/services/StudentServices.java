package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentDetails;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentServices  {
	
	@Autowired
	 StudentRepo repo;

	public List<StudentDetails> getAll()
	{
	
		return repo.findAll();
	}

	public String addstud(StudentDetails details) {
		
		 repo.save(details);
		 return "Student Add Sucessfully";
	}
	
	public StudentDetails update(StudentDetails details)
	{
		repo.save(details);
		return details;
	}
	
	public void delete(int id)
	{
		StudentDetails stud=repo.getOne(id);
		repo.delete(stud);
	}
	
	
	

}
