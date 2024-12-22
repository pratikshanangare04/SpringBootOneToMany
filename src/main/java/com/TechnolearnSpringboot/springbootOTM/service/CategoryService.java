package com.TechnolearnSpringboot.springbootOTM.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TechnolearnSpringboot.springbootOTM.dto.Category;
import com.TechnolearnSpringboot.springbootOTM.repository.CategoryRepository;
import com.TechnolearnSpringboot.springbootOTM.repository.ProductRepository;

@Service
public class CategoryService {
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	CategoryRepository categoryRepo;
	
	public Category saveCategory(Category category)
	{
		return categoryRepo.save(category);
	}
}
