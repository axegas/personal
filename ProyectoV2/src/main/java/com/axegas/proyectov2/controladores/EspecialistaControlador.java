package com.axegas.proyectov2.controladores;

import javax.validation.Valid;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axegas.proyectov2.entidades.Especialista;
import com.axegas.proyectov2.entidades.Usuario;
import com.axegas.proyectov2.util.ControllerUtil;
import com.axegas.proyectov2.util.Rol;

@Controller
@RequestMapping("/especialistas")
public class EspecialistaControlador extends ControllerUtil {

	@GetMapping("/lista")
	public String listaEspecialistas(Model model) {
		model.addAttribute("especialistas", especialistaServicio.findAll());
		return "listaespecialistas";
	}

	@GetMapping("/detalle/{id}")
	public String detalleEspecialista(@PathVariable long id, Model model) {
		Especialista especialista = especialistaServicio.findById(id);
		model.addAttribute("especialista", especialista);
		model.addAttribute("pacientes", pacienteServicio.findByEspecialista(especialista));
		return "detalleespecialista";
	}
	
	@GetMapping("/nuevo")
	public String nuevoEspecialista(Model model) {	
		model.addAttribute("especialista", new Especialista());
		model.addAttribute("especialidades", especialidadServicio.findAll());
		model.addAttribute("accion", "insertar");
		return "nuevoespecialista";
	}
	
	@GetMapping("/actualizar/{id}")
	public String actualizarEspecialista(@PathVariable long id, Model model) {	
		model.addAttribute("especialista", especialistaServicio.findById(id));
		model.addAttribute("especialidades", especialidadServicio.findAll());
		model.addAttribute("accion", "editar");
		return "nuevoespecialista";
	}
	
	@PostMapping("/submit")
	public String nuevoEspecialistaSubmit(Model model, @Valid Especialista especialista,
			BindingResult result) {

	    if(result.hasErrors()) {
	    	model.addAttribute("especialidades", especialidadServicio.findAll());
			model.addAttribute("accion", "insertar");
	    	return "nuevoespecialista";
	    }
	    
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	    String encodedPassword = passwordEncoder.encode("1234");

		Usuario usuario = new Usuario(especialista.getDni(),encodedPassword, Rol.JOB);
		
		Especialista e = especialistaServicio.findByDni(especialista.getDni());
		
		if(e!=null) { //especialista ya existe - actualizar datos
			especialista.setIdespecialista(e.getIdespecialista());
			especialista.setUsuario(e.getUsuario());
		} else { // especialista no existe - insertar
			especialista.setUsuario(usuario);
			usuarioServicio.save(usuario);	
		}
		especialistaServicio.save(especialista);

		return "redirect:/especialistas/lista";
	}

}
