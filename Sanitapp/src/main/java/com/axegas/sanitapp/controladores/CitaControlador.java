package com.axegas.sanitapp.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axegas.sanitapp.entidades.Cita;
import com.axegas.sanitapp.util.ControllerUtil;

@Controller
@RequestMapping("/citas")
public class CitaControlador extends ControllerUtil {

	@GetMapping("/lista")
	public String listaCitas(Model model) {
		model.addAttribute("citas", citaServicio.findAll());
		return "listacitas";
	}

	@GetMapping("/nueva")
	public String nuevaCita(Model model) {
		model.addAttribute("cita", new Cita());
		model.addAttribute("pacientes", pacienteServicio.findAll());
		model.addAttribute("especialidades", especialidadServicio.findAll());
		return "nuevacita";
	}

	@PostMapping("/submit")
	public String cita(Cita cita) {
		citaServicio.save(cita);
		return "redirect:/citas/lista";
	}
	
	@GetMapping("/cancelar/{id}")
	public String cancelarCita(@PathVariable Long id) {
		Cita cita = citaServicio.findById(id);
		cita.setEstado("Cancelada");
		citaServicio.save(cita);
		return "redirect:/citas/lista";
	}

}
