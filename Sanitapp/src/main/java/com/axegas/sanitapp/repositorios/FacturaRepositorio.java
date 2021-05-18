package com.axegas.sanitapp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.sanitapp.entidades.Factura;

public interface FacturaRepositorio  extends JpaRepository<Factura, Long> {

}
