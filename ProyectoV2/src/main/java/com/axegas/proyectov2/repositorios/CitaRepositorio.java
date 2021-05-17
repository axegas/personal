package com.axegas.proyectov2.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.proyectov2.entidades.Cita;
import com.axegas.proyectov2.entidades.Especialidad;

public interface CitaRepositorio extends JpaRepository<Cita, Long>   {
	
	List<Cita> findByEspecialidad(Especialidad especialidad);	
	
}
