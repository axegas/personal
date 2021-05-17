package com.axegas.proyectov2.servicios;

import org.springframework.stereotype.Service;

import com.axegas.proyectov2.entidades.Especialidad;
import com.axegas.proyectov2.repositorios.EspecialidadRepositorio;
import com.axegas.proyectov2.util.BaseService;

@Service
public class EspecialidadServicio extends BaseService<Especialidad, Long, EspecialidadRepositorio>  {
	
	public Especialidad findByNombre(String nombre) {
		return repositorio.findByNombre(nombre);
	}
	
}
