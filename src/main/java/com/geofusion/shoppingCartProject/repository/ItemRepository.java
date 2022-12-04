package com.geofusion.shoppingCartProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geofusion.shoppingCartProject.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	
}
