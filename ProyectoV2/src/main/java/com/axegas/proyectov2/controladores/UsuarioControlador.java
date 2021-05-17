package com.axegas.proyectov2.controladores;

import java.security.Principal;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.axegas.proyectov2.entidades.Especialista;
import com.axegas.proyectov2.entidades.Usuario;
import com.axegas.proyectov2.util.ControllerUtil;
import com.axegas.proyectov2.util.Rol;

@Controller
public class UsuarioControlador extends ControllerUtil implements ErrorController {

	@GetMapping("/")
	public String welcome(Model model, Principal principal) throws InterruptedException {
		Usuario usuario = (Usuario) usuarioServicio.loadUserByUsername(principal.getName());
		if(usuario.getRol().equals(Rol.ADMIN)) {
			return "plantilla";
		} else if (usuario.getUsername().equals("user")) {
			return "redirect:/citas/lista";
		} 
		
		Especialista especialista = especialistaServicio.findByUsuario(usuario);
		model.addAttribute("especialista", especialista);
		model.addAttribute("pacientes", pacienteServicio.findByEspecialista(especialista));
		return "detalleespecialista";
		
		//return "redirect:/perfil";
	}

	@GetMapping("/login")
	public String autenticado(Principal principal) {
		if (principal == null) {
			return "/login";
		} else {
			return "redirect:/";
		}
	}
	
	@GetMapping("/perfil")
	public String miPerfil(Model model, Principal principal) {
		Usuario usuario = (Usuario) usuarioServicio.loadUserByUsername(principal.getName());
		if(usuario.getRol().equals(Rol.ADMIN)) {
			return "plantilla";
		} else if (usuario.getUsername().equals("user")) {
			return "listacitas";
		} 
		
		Especialista especialista = especialistaServicio.findByUsuario(usuario);
		model.addAttribute("especialista", especialista);
		model.addAttribute("pacientes", pacienteServicio.findByEspecialista(especialista));
		return "detalleespecialista";
	}
	
	@GetMapping("/perfil/actualizar")
	public String actualizarEspecialista(Model model, Principal principal) {	
		if(principal.getName().equals("admin")) {
			return "redirect:/";
		}
		Usuario usuario = (Usuario) usuarioServicio.loadUserByUsername(principal.getName());
		model.addAttribute("especialista", especialistaServicio.findByUsuario(usuario));
		model.addAttribute("especialidades", especialidadServicio.findAll());
		model.addAttribute("accion", "editar");
		return "nuevoespecialista";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

	@GetMapping("/error")
	public String error(HttpServletRequest request, Model model) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

		String mensaje = "";

		if (status != null) {
			int statusCode = Integer.valueOf(status.toString());

			if (statusCode == HttpStatus.NOT_FOUND.value()) {
				mensaje = "Página no encontrada";
			} else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				mensaje = "Error del servidor";
			} else if (statusCode == HttpStatus.FORBIDDEN.value()) {
				mensaje = "No tiene permisos para acceder";
			}

			model.addAttribute("mensaje", mensaje);
			return "paginaerror";

		} else {
			return "redirect:/";
		}
	}

}
