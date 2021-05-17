package com.axegas.proyectov2.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axegas.proyectov2.entidades.Cita;
import com.axegas.proyectov2.entidades.Especialista;
import com.axegas.proyectov2.entidades.Paciente;
import com.axegas.proyectov2.entidades.Sesion;
import com.axegas.proyectov2.repositorios.SesionRepositorio;
import com.axegas.proyectov2.util.BaseService;

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
