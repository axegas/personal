package com.axegas.proyectov2.controladores;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axegas.proyectov2.entidades.Cita;
import com.axegas.proyectov2.entidades.Especialista;
import com.axegas.proyectov2.entidades.Paciente;
import com.axegas.proyectov2.entidades.Usuario;
import com.axegas.proyectov2.util.ControllerUtil;

@Controller
@RequestMapping("/pacientes")
public class PacienteControlador extends ControllerUtil {

	@GetMapping("/lista")
	public String listaPacientes(Model model, Principal principal) {

		Usuario usuario = (Usuario) usuarioServicio.loadUserByUsername(principal.getName());

		if (usuario.getRol().toString().equals("JOB")) {
			Especialista especialista = especialistaServicio.findByUsuario(usuario);
			model.addAttribute("pacientes", pacienteServicio.findByEspecialidad(especialista.getEspecialidad()));
		} else {
			model.addAttribute("pacientes", pacienteServicio.findAll());
		}

		return "listapacientes";
	}

	@GetMapping("/detalle/{id}")
	public String detallePaciente(@PathVariable long id, Model model, Principal principal) {
		List<Cita> citas;
		Paciente paciente = pacienteServicio.findById(id);
		if (!principal.getName().equals("admin")) {
			Usuario usuario = (Usuario) usuarioServicio.loadUserByUsername(principal.getName());
			Especialista especialista = especialistaServicio.findByUsuario(usuario);
			citas = citaServicio.findByEspecialidad(especialista.getEspecialidad());
		} else {
			citas = paciente.getCitas();
		}

		model.addAttribute("paciente", paciente);
		model.addAttribute("citas", citas);
		return "detallepaciente";
	}

	@GetMapping("/nuevo")
	public String nuevoPaciente(Model model) {
		model.addAttribute("paciente", new Paciente());
		model.addAttribute("accion", "insertar");
		return "nuevopaciente";
	}

	@GetMapping("/actualizar/{id}")
	public String actualizarPaciente(@PathVariable long id, Model model) {
		model.addAttribute("paciente", pacienteServicio.findById(id));
		model.addAttribute("accion", "editar");
		return "nuevopaciente";
	}

	@PostMapping("/submit")
	public String nuevoPacienteSubmit(@Valid Paciente paciente, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("accion", "insertar");
			return "nuevopaciente";
		}
		Paciente p = pacienteServicio.findByDni(paciente.getDni());
		if (p != null) {
			paciente.setIdpaciente(p.getIdpaciente());
		}
		pacienteServicio.save(paciente);
		return "redirect:/pacientes/lista";
	}

}
