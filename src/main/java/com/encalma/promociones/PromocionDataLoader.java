package com.encalma.promociones;

import com.encalma.promociones.Entity.promotion;
import com.encalma.promociones.Repository.promotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PromocionDataLoader implements CommandLineRunner {

    private final promotionRepository repository;

    public PromocionDataLoader(promotionRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.save(new promotion(
                null,
                "Promoción del Dia de las madres",
                "Full Body depilacion laser 10 sesiones",
                "https://example.com/verano.jpg",
                "$5600 MXN",
                LocalDate.of(2025, 5, 1),
                LocalDate.of(2025, 5, 31)
        ));
    }
}

