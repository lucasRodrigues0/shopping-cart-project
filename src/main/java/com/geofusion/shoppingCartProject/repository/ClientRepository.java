package com.geofusion.shoppingCartProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geofusion.shoppingCartProject.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
