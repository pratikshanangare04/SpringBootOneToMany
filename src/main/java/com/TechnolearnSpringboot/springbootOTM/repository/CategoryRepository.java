package com.TechnolearnSpringboot.springbootOTM.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TechnolearnSpringboot.springbootOTM.dto.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
