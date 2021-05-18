package com.axegas.sanitapp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.sanitapp.entidades.Proveedor;

public interface ProveedorRepositorio  extends JpaRepository<Proveedor, Long> {
	
	Proveedor findByDni(String dni);

}
