package com.axegas.proyectov2.controladores;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axegas.proyectov2.entidades.Proveedor;
import com.axegas.proyectov2.util.ControllerUtil;

@Controller
@RequestMapping("/proveedores")
public class ProveedorControlador extends ControllerUtil {

	@GetMapping("/lista")
	public String listaProveedores(Model model) {
		model.addAttribute("proveedores", proveedorServicio.findAll());
		return "listaproveedores";
	}
	
	@GetMapping("/detalle/{id}")
	public String detalleProveedor(@PathVariable long id, Model model) {
		model.addAttribute("proveedor", proveedorServicio.findById(id));
		return "detalleproveedor";
	}
	
	@GetMapping("/nuevo")
	public String nuevoProveedor(Model model) {	
		model.addAttribute("proveedor", new Proveedor());
		model.addAttribute("accion", "insertar");
		return "nuevoproveedor";
	}
	
	@GetMapping("/actualizar/{id}")
	public String actualizarProveedor(@PathVariable long id, Model model) {	
		model.addAttribute("proveedor", proveedorServicio.findById(id));
		model.addAttribute("accion", "editar");
		return "nuevoproveedor";
	}
	
	@PostMapping("/submit")
	public String nuevoProveedorSubmit(@Valid Proveedor proveedor, Model model, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("accion", "insertar");
			return "nuevoproveedor";
		}
		Proveedor p = proveedorServicio.findByDni(proveedor.getDni());
		if(p!=null) {
			proveedor.setIdproveedor(p.getIdproveedor());					
		}
		proveedorServicio.save(proveedor);
		return "redirect:/proveedores/lista";
	}
}
