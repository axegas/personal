package com.axegas.sanitapp.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.sanitapp.entidades.Cita;
import com.axegas.sanitapp.entidades.Especialidad;

public interface CitaRepositorio extends JpaRepository<Cita, Long>   {
	
	List<Cita> findByEspecialidad(Especialidad especialidad);	
	
}
