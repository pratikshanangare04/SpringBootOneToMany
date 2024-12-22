package com.TechnolearnSpringboot.springbootOTM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.TechnolearnSpringboot.springbootOTM.dto.School;
import com.TechnolearnSpringboot.springbootOTM.dto.Student;
import com.TechnolearnSpringboot.springbootOTM.service.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController 
{
	@Autowired
	SchoolService service;
	
	@PostMapping("/addSchool")
	public School addSchools(@RequestBody School school)
	{
		return service.saveSchool(school);
	}
	
	
	@GetMapping("/readSchool")
	public List<School> readSchools()
	{
		return service.readSchool();
	}
	
	@PatchMapping("/updateSchool") 
	public School updateSchools(@RequestParam int id, @RequestBody School school)
	{
		return service.updateSchool(id, school);
	}
	
	@PatchMapping("/updateStudent")
	public Student updateStudents(@RequestParam int studId, @RequestBody Student student)
	{
		return service.updateStudent(studId, student);
	}
	
	@DeleteMapping("/deleteSchool")
	public School deleteSchools(@RequestParam int id)
	{
		return service.deleteSchool(id);
	}
}
