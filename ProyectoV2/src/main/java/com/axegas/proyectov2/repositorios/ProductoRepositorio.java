package com.axegas.proyectov2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.proyectov2.entidades.Producto;

public interface ProductoRepositorio  extends JpaRepository<Producto, Long> {

}
