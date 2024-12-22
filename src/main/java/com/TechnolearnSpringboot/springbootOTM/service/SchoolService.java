package com.TechnolearnSpringboot.springbootOTM.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnolearnSpringboot.springbootOTM.dto.School;
import com.TechnolearnSpringboot.springbootOTM.dto.Student;
import com.TechnolearnSpringboot.springbootOTM.repository.SchoolRepo;
import com.TechnolearnSpringboot.springbootOTM.repository.StudentRepo;

@Service
public class SchoolService 
{
	@Autowired
	StudentRepo studrepo;
	
	@Autowired
	SchoolRepo srepo;
	
	public School saveSchool(School school)
	{
		srepo.save(school);
		return school;
	}
	
	public List<School> readSchool()
	{
		List<School> school=srepo.findAll();
		return school;
	}
	
	public School updateSchool(int id,School school)
	{
		Optional<School> optional=srepo.findById(id);
		
		if(optional.isPresent())
		{
//			school.setId(optional.get().getId());
//			school.setStudent(optional.get().getStudent());
			school.setId(id);
			school.setStudent(optional.get().getStudent());
			srepo.save(school);
			return school;
		}
		return null;
	}
	
//	public Student updateStudent(int sid, int studId, Student updateStudent)
//	{
//		Optional<School> optional=srepo.findById(sid);
//		if(optional.isPresent())
//		{
//			for(Student student:optional.get().getStudent())
//			{
//				if(student.getId()==studId)
//				{
//					student.setName(updateStudent.getName());
//					student.setAddress(updateStudent.getAddress());
//					student.setPhone(updateStudent.getPhone());
//					studrepo.save(student);
//					return student;
//				}
//			}
//		}
//		return null;
//	}
	
	public Student updateStudent(int roll, Student student)
	{
		Optional<Student> optional=studrepo.findById(roll);
		if(optional.isPresent())
		{
			student.setId(roll);
			studrepo.save(student);
			return student;
		}
		return null;
	}
	public School deleteSchool(int id)
	{
		Optional<School> optional=srepo.findById(id);
		if(optional.isPresent())
		{
			srepo.deleteById(id);
			return optional.get();
		}
		return null;
	}
}
