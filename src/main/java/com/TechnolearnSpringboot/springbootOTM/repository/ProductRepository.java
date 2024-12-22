package com.TechnolearnSpringboot.springbootOTM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TechnolearnSpringboot.springbootOTM.dto.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
