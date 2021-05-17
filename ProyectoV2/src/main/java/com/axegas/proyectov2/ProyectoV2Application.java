package com.axegas.proyectov2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.axegas.proyectov2.servicios.FacturaServicio;
import com.axegas.proyectov2.servicios.PacienteServicio;
import com.axegas.proyectov2.servicios.ProductoServicio;
import com.axegas.proyectov2.servicios.SesionServicio;
import com.axegas.proyectov2.servicios.UsuarioServicio;

@SpringBootApplication
public class ProyectoV2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoV2Application.class, args);
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
