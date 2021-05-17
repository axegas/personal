package com.axegas.proyectov2.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axegas.proyectov2.entidades.Especialidad;
import com.axegas.proyectov2.entidades.Especialista;
import com.axegas.proyectov2.entidades.Paciente;
import com.axegas.proyectov2.repositorios.PacienteRepositorio;
import com.axegas.proyectov2.util.BaseService;

@Service
public class PacienteServicio extends BaseService<Paciente, Long, PacienteRepositorio>  {

	public Paciente findByDni(String dni) {		
		return repositorio.findByDni(dni);
	}
	
	public List<Paciente> findByEspecialidad(Especialidad especialidad){
		return repositorio.findByEspecialidad(especialidad);
	}
	
	public List<Paciente> findByEspecialista(Especialista especialista){
		return repositorio.findByEspecialista(especialista);
	}
	
}
