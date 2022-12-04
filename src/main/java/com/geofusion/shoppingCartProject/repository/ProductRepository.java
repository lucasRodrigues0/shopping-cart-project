package com.geofusion.shoppingCartProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geofusion.shoppingCartProject.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
