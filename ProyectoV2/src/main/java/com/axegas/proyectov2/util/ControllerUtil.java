package com.axegas.proyectov2.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.axegas.proyectov2.servicios.CitaServicio;
import com.axegas.proyectov2.servicios.EspecialidadServicio;
import com.axegas.proyectov2.servicios.EspecialistaServicio;
import com.axegas.proyectov2.servicios.FacturaServicio;
import com.axegas.proyectov2.servicios.PacienteServicio;
import com.axegas.proyectov2.servicios.ProductoServicio;
import com.axegas.proyectov2.servicios.ProveedorServicio;
import com.axegas.proyectov2.servicios.SesionServicio;
import com.axegas.proyectov2.servicios.UsuarioServicio;

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
