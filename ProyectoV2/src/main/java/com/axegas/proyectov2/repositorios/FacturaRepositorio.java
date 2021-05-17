package com.axegas.proyectov2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.proyectov2.entidades.Factura;

public interface FacturaRepositorio  extends JpaRepository<Factura, Long> {

}
