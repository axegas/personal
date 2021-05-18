package com.axegas.sanitapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.axegas.sanitapp.servicios.FacturaServicio;
import com.axegas.sanitapp.servicios.PacienteServicio;
import com.axegas.sanitapp.servicios.ProductoServicio;
import com.axegas.sanitapp.servicios.SesionServicio;
import com.axegas.sanitapp.servicios.UsuarioServicio;

@SpringBootApplication
public class SanitappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanitappApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(PacienteServicio pacienteServicio, FacturaServicio facturaServicio,
			ProductoServicio productoServicio, SesionServicio historialServicio, UsuarioServicio usuarioServicio) {

		return (args) -> {

			//BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			// String encodedPassword = passwordEncoder.encode("1234");
			// Usuario user = new Usuario("user",encodedPassword,Rol.USER);
			// usuarioServicio.save(user);
			/*
			List<Usuario> usuarios = usuarioServicio.findAll();
			usuarios.forEach(u -> {
				String encodedPassword = passwordEncoder.encode("1234");
				if (u.getUsername().equals("admin")) {
					encodedPassword = passwordEncoder.encode("admin");
				} else if (u.getUsername().equals("user")) {
					encodedPassword = passwordEncoder.encode("user");
				}
				u.setPassword(encodedPassword);
				usuarioServicio.save(u);
			});*/

		};
	}

}
