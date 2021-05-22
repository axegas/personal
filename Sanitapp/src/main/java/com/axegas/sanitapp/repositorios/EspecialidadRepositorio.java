package com.axegas.sanitapp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.sanitapp.entidades.Especialidad;

public interface EspecialidadRepositorio extends JpaRepository<Especialidad, Long>  {
	
}

