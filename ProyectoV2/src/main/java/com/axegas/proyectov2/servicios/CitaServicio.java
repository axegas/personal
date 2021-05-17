package com.axegas.proyectov2.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axegas.proyectov2.entidades.Cita;
import com.axegas.proyectov2.entidades.Especialidad;
import com.axegas.proyectov2.repositorios.CitaRepositorio;
import com.axegas.proyectov2.util.BaseService;

@Service
public class CitaServicio extends BaseService<Cita, Long, CitaRepositorio> {
	
	public List<Cita> findByEspecialidad(Especialidad especialidad){
		return repositorio.findByEspecialidad(especialidad);
	}
	
}
