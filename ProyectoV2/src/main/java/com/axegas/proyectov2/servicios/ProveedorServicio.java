package com.axegas.proyectov2.servicios;

import org.springframework.stereotype.Service;

import com.axegas.proyectov2.entidades.Proveedor;
import com.axegas.proyectov2.repositorios.ProveedorRepositorio;
import com.axegas.proyectov2.util.BaseService;

@Service
public class ProveedorServicio extends BaseService<Proveedor, Long, ProveedorRepositorio>  {
	
	public Proveedor findByDni(String dni) {		
		return repositorio.findByDni(dni);
	}

}
