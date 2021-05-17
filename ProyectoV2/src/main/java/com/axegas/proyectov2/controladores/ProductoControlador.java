package com.axegas.proyectov2.controladores;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axegas.proyectov2.entidades.Producto;
import com.axegas.proyectov2.util.ControllerUtil;

@Controller
@RequestMapping("/productos")
public class ProductoControlador extends ControllerUtil {

	@GetMapping("/lista")
	public String listaproductos(Model model) {
		model.addAttribute("productos", productoServicio.findAll());
		return "listaproductos";
	}
	
	@GetMapping("/nuevo")
	public String nuevoProducto(Model model) {	
		model.addAttribute("producto", new Producto());
		model.addAttribute("proveedores", proveedorServicio.findAll());
		return "nuevoproducto";
	}

	@PostMapping("/submit")
	public String nuevoProductoSubmit(Model model, @Valid Producto producto, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("proveedores", proveedorServicio.findAll());
			return "nuevoproducto";
		}
		productoServicio.save(producto);
		return "redirect:/productos/lista";
	}
}
