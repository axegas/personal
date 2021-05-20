package com.axegas.sanitapp.servicios;

import org.springframework.stereotype.Service;

import com.axegas.sanitapp.entidades.Cita;
import com.axegas.sanitapp.entidades.Sesion;
import com.axegas.sanitapp.repositorios.SesionRepositorio;
import com.axegas.sanitapp.util.BaseService;

@Service
public class SesionServicio extends BaseService<Sesion, Long, SesionRepositorio>   {
	
	public Sesion findByCita(Cita cita) {
		return repositorio.findByCita(cita);
	}
	
}
