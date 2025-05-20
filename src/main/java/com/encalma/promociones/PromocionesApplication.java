package com.encalma.promociones;

import com.encalma.promociones.Repository.promotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PromocionesApplication {

	@Autowired
	private promotionRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PromocionesApplication.class, args);
	}

}
