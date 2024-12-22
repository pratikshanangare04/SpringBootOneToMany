package com.TechnolearnSpringboot.springbootOTM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.TechnolearnSpringboot.springbootOTM.dto.Category;
import com.TechnolearnSpringboot.springbootOTM.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {

	@Autowired
	CategoryService service;
	
	@RequestMapping("/createCategory")
	public Category saveCategory(@RequestBody Category category)
	{
		return service.saveCategory(category);
	}
}
