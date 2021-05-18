package com.axegas.sanitapp.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.axegas.sanitapp.entidades.Especialidad;
import com.axegas.sanitapp.entidades.Especialista;
import com.axegas.sanitapp.entidades.Paciente;

public interface PacienteRepositorio  extends JpaRepository<Paciente, Long>{
	
	Paciente findByDni(String dni);
	
	@Query("SELECT p FROM Paciente p INNER JOIN Cita c ON p = c.paciente WHERE c.especialidad=?1")
	List<Paciente> findByEspecialidad(Especialidad especialidad);
	
	@Query(value = "SELECT p.* FROM sesion s INNER JOIN cita c ON s.idcita=c.idcita INNER JOIN paciente p ON p.idpaciente = c.idpaciente WHERE s.idespecialista=2 GROUP BY 1", nativeQuery = true)
	List<Paciente> findByEspecialista(Especialista especialista);
}
