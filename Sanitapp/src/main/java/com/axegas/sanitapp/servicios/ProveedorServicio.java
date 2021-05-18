package com.axegas.sanitapp.servicios;

import org.springframework.stereotype.Service;

import com.axegas.sanitapp.entidades.Proveedor;
import com.axegas.sanitapp.repositorios.ProveedorRepositorio;
import com.axegas.sanitapp.util.BaseService;

@Service
public class ProveedorServicio extends BaseService<Proveedor, Long, ProveedorRepositorio>  {
	
	public Proveedor findByDni(String dni) {		
		return repositorio.findByDni(dni);
	}

}
