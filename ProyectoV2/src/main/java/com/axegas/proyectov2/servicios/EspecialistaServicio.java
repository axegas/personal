package com.axegas.proyectov2.servicios;

import org.springframework.stereotype.Service;

import com.axegas.proyectov2.entidades.Especialista;
import com.axegas.proyectov2.entidades.Usuario;
import com.axegas.proyectov2.repositorios.EspecialistaRepositorio;
import com.axegas.proyectov2.util.BaseService;

@Service
public class EspecialistaServicio extends BaseService<Especialista, Long, EspecialistaRepositorio>  {

	
	public Especialista findByDni(String dni) {		
		return repositorio.findByDni(dni);
	}
	
	public Especialista findByUsuario(Usuario usuario) {
		return repositorio.findByUsuario(usuario);
	}


}
