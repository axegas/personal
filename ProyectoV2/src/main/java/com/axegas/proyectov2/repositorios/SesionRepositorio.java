package com.axegas.proyectov2.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.axegas.proyectov2.entidades.Cita;
import com.axegas.proyectov2.entidades.Especialista;
import com.axegas.proyectov2.entidades.Paciente;
import com.axegas.proyectov2.entidades.Sesion;

public interface SesionRepositorio  extends JpaRepository<Sesion, Long>  {
	
	List<Sesion> findByEspecialista(Especialista especialista);
	
	@Query("select s from Sesion s inner join Cita c on s.cita = c where c.paciente=?1")
	List<Sesion> findByPaciente(Paciente paciente);
	
	Sesion findByCita(Cita cita);
}
