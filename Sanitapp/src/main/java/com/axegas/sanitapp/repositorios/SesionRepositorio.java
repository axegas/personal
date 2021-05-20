package com.axegas.sanitapp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.sanitapp.entidades.Cita;
import com.axegas.sanitapp.entidades.Sesion;

public interface SesionRepositorio  extends JpaRepository<Sesion, Long>  {
	
	Sesion findByCita(Cita cita);
}
