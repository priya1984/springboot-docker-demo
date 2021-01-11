package com.stums.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stums.app.pojos.StudentPOJO;
import com.stums.app.repository.StudentRepository;

//API endpoints for accessing student records
@RestController
public class StudentServiceController {
	
	int id;
	
	@Autowired
	StudentRepository repo;
	
	//API end-point to access all students list
	@GetMapping(value="/allStudents")
	public List<StudentPOJO> getEmails()
	{
		List<StudentPOJO> studentList = repo.findAll();
		return studentList;
	}
	
	//API end-point to access filtered list of student whose fees it collected
	@GetMapping(value="/stufeescollected")
	public List<StudentPOJO> getFinEmails()
	{
		List<StudentPOJO> studentList = repo.search();
		return studentList;
	}

}
