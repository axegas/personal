package com.axegas.sanitapp.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.axegas.sanitapp.entidades.Cita;
import com.axegas.sanitapp.entidades.Paciente;
import com.axegas.sanitapp.entidades.Sesion;
import com.axegas.sanitapp.util.ControllerUtil;

@Controller
@RequestMapping("/sesiones")
public class SesionControlador extends ControllerUtil {

	@GetMapping("/nueva/{id}")
	public String asignar(@PathVariable Long id, Model model) {

		Cita cita = citaServicio.findById(id);

		model.addAttribute("citas", cita);
		Sesion sesion = sesionServicio.findByCita(cita);
		if (sesion == null) {
			model.addAttribute("sesion", new Sesion());
		} else {
			model.addAttribute("sesion", sesion);

		}
		// del.addAttribute("especialistas",
		// especialistaServicio.findByEspecialidad(cita.getEspecialidad()));

		return "nuevasesion";
	}

	@PostMapping("/submit")
	public String sesionSubmit(Sesion sesion) {
		Cita c = sesion.getCita();
		Sesion s = sesionServicio.findByCita(c);
		if(s!=null) {
			sesion.setIdsesion(s.getIdsesion());
		} else {
			sesion.getCita().setEstado("Pendiente de revisar");
			citaServicio.save(sesion.getCita());
		}
		sesionServicio.save(sesion);
		return "redirect:/citas/lista";
	}

	@GetMapping("/revisar/{id}")
	public String revisar(@PathVariable Long id, Model model) {
		Sesion sesion = sesionServicio.findById(id);
		model.addAttribute("sesion", sesion);
		model.addAttribute("diagnostico", sesion.getCita().getPaciente().getDiagnostico());
		return "revisarsesion";
	}

	@PostMapping("/revisar/submit")
	public String revisarSubmit(@RequestParam(name = "diagnostico") String diagnostico, Sesion sesion) {
		Cita c = sesion.getCita();
		Sesion s = sesionServicio.findByCita(c);
		s.setDescripcion(sesion.getDescripcion());
		s.setTratamiento(sesion.getTratamiento());
		c.setEstado("Revisada");
		Paciente p = c.getPaciente();
		p.setDiagnostico(diagnostico);
		pacienteServicio.save(p);
		citaServicio.save(c);
		sesionServicio.save(s);

		return "redirect:/perfil";
	}

}
