package com.axegas.proyectov2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.proyectov2.entidades.Proveedor;

public interface ProveedorRepositorio  extends JpaRepository<Proveedor, Long> {
	
	Proveedor findByDni(String dni);

}
