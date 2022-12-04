package com.geofusion.shoppingCartProject.configuration;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.geofusion.shoppingCartProject.entity.Client;
import com.geofusion.shoppingCartProject.entity.Item;
import com.geofusion.shoppingCartProject.entity.Product;
import com.geofusion.shoppingCartProject.repository.ClientRepository;
import com.geofusion.shoppingCartProject.repository.ItemRepository;
import com.geofusion.shoppingCartProject.repository.ProductRepository;

@Configuration
public class Config {
	
	@Bean
	public CommandLineRunner init(@Autowired ClientRepository clients, @Autowired ProductRepository products, @Autowired ItemRepository items) {
		return args -> {
			clients.save(new Client());
			clients.save(new Client());
			clients.save(new Client());
			
			products.save(new Product(100000L,"television"));
			products.save(new Product(100001L,"videogame"));
			products.save(new Product(100002L,"microwave"));
			 
			Product p = new Product(10003L, "Grill");
			Product p2 = new Product(10004L, "Computer");
			products.save(p);
			products.save(p2);
			
			items.save(new Item(p, new BigDecimal(4500.00), 1));
			items.save(new Item(p, new BigDecimal(4500.00), 1));
			items.save(new Item(p, new BigDecimal(4500.00), 2));
			items.save(new Item(p2, new BigDecimal(3200.00), 1));
		};
	}
	
}
