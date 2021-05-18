package com.axegas.sanitapp.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axegas.sanitapp.entidades.Cita;
import com.axegas.sanitapp.entidades.Especialista;
import com.axegas.sanitapp.entidades.Paciente;
import com.axegas.sanitapp.entidades.Sesion;
import com.axegas.sanitapp.repositorios.SesionRepositorio;
import com.axegas.sanitapp.util.BaseService;

@Service
public class SesionServicio extends BaseService<Sesion, Long, SesionRepositorio>   {
	
	public List<Sesion> findByEspecialista(Especialista especialista){
		return repositorio.findByEspecialista(especialista);
	}
	
	public List<Sesion> findByPaciente(Paciente paciente){
		return repositorio.findByPaciente(paciente);
	}
	
	public Sesion findByCita(Cita cita) {
		return repositorio.findByCita(cita);
	}
	
}
