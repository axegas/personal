package com.axegas.sanitapp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.sanitapp.entidades.Producto;

public interface ProductoRepositorio  extends JpaRepository<Producto, Long> {

}
