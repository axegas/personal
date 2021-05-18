package com.axegas.sanitapp.servicios;

import org.springframework.stereotype.Service;

import com.axegas.sanitapp.entidades.Especialista;
import com.axegas.sanitapp.entidades.Usuario;
import com.axegas.sanitapp.repositorios.EspecialistaRepositorio;
import com.axegas.sanitapp.util.BaseService;

@Service
public class EspecialistaServicio extends BaseService<Especialista, Long, EspecialistaRepositorio>  {

	
	public Especialista findByDni(String dni) {		
		return repositorio.findByDni(dni);
	}
	
	public Especialista findByUsuario(Usuario usuario) {
		return repositorio.findByUsuario(usuario);
	}


}
