package com.axegas.sanitapp.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axegas.sanitapp.entidades.Especialidad;
import com.axegas.sanitapp.entidades.Especialista;
import com.axegas.sanitapp.entidades.Paciente;
import com.axegas.sanitapp.repositorios.PacienteRepositorio;
import com.axegas.sanitapp.util.BaseService;

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
