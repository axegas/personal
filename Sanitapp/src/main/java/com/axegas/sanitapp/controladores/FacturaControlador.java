package com.axegas.sanitapp.controladores;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.axegas.sanitapp.entidades.Factura;
import com.axegas.sanitapp.entidades.Producto;
import com.axegas.sanitapp.util.ControllerUtil;

@Controller
@RequestMapping("/facturas")
public class FacturaControlador extends ControllerUtil {

	@GetMapping("/lista")
	public String listaFacturas(Model model) {
		model.addAttribute("facturas", facturaServicio.findAll());
		return "listafacturas";
	}

	@GetMapping("/detalle/{id}")
	public String detalleFactura(@PathVariable long id, Model model) {
		model.addAttribute("factura", facturaServicio.findById(id));
		return "detallefactura";
	}

	@GetMapping("/nueva")
	public String comprar(Model model, Principal principal) {
		
		model.addAttribute("productos", productoServicio.findAll());
		model.addAttribute("pacientes", pacienteServicio.findAll());
		
		Factura factura = new Factura();
		if(principal.getName().equals("admin")) {
			model.addAttribute("especialistas", especialistaServicio.findAll());
		} else {
			model.addAttribute("especialistas", especialistaServicio.findByDni(principal.getName()));
		}
		
		model.addAttribute("factura", factura);
		return "nuevafactura";
	}

	@PostMapping("/submit")
	public String compra(Factura factura,
			@RequestParam("productos") List<Producto> productos) {

		float importe = 0;
		for (Producto p : productos) {
			importe += p.getPrecio();
		}

		factura.setProductos(productos);
		factura.setImporte(importe);
		facturaServicio.save(factura);
		return "redirect:/facturas/lista";
	}

}
