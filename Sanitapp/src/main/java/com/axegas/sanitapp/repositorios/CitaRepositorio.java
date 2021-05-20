package com.axegas.sanitapp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.sanitapp.entidades.Cita;

public interface CitaRepositorio extends JpaRepository<Cita, Long>   {
		
}
