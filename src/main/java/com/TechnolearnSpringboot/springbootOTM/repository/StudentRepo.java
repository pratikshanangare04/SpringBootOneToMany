package com.TechnolearnSpringboot.springbootOTM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TechnolearnSpringboot.springbootOTM.dto.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
