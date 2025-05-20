package com.encalma.promociones.Repository;

import com.encalma.promociones.Entity.promotion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface promotionRepository  extends JpaRepository<promotion, Long> {
    List<promotion> findAll();
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar promociones por título o fecha
    // List<promotion> findByTitulo(String titulo);
    // List<promotion> findByFechaInicioAfter(LocalDate fecha);
    // List<promotion> findByFechaFinBefore(LocalDate fecha);
}
