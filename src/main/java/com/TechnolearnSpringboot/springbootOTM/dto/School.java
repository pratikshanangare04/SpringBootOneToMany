package com.TechnolearnSpringboot.springbootOTM.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class School 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="school_id")
	List<Student> student;

	public School() {
		
	}

	public School(String name, List<Student> student) {
		super();
		this.name = name;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", student=" + student + "]";
	}
	
	
	
}
