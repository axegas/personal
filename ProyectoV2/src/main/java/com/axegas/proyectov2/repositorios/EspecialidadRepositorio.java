package com.axegas.proyectov2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.proyectov2.entidades.Especialidad;

public interface EspecialidadRepositorio extends JpaRepository<Especialidad, Long>  {
	
	Especialidad findByNombre(String nombre);

}
