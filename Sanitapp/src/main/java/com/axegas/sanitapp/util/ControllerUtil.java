package com.axegas.sanitapp.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.axegas.sanitapp.servicios.CitaServicio;
import com.axegas.sanitapp.servicios.EspecialidadServicio;
import com.axegas.sanitapp.servicios.EspecialistaServicio;
import com.axegas.sanitapp.servicios.FacturaServicio;
import com.axegas.sanitapp.servicios.PacienteServicio;
import com.axegas.sanitapp.servicios.ProductoServicio;
import com.axegas.sanitapp.servicios.ProveedorServicio;
import com.axegas.sanitapp.servicios.SesionServicio;
import com.axegas.sanitapp.servicios.UsuarioServicio;

public class ControllerUtil {
	
	@Autowired
	protected SesionServicio sesionServicio;
	
	@Autowired
	protected PacienteServicio pacienteServicio;
	
	@Autowired
	protected EspecialistaServicio especialistaServicio;
	
	@Autowired
	protected UsuarioServicio usuarioServicio;
	
	@Autowired
	protected CitaServicio citaServicio;
	
	@Autowired
	protected EspecialidadServicio especialidadServicio;
	
	@Autowired
	protected ProveedorServicio proveedorServicio;
	
	@Autowired
	protected ProductoServicio productoServicio;
	
	@Autowired
	protected FacturaServicio facturaServicio;
	
}
