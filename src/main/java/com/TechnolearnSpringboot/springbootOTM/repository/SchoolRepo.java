package com.TechnolearnSpringboot.springbootOTM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TechnolearnSpringboot.springbootOTM.dto.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer>
{

}
