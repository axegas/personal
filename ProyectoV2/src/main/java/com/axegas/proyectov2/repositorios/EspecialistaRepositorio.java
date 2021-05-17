package com.axegas.proyectov2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.proyectov2.entidades.Especialista;
import com.axegas.proyectov2.entidades.Usuario;

public interface EspecialistaRepositorio extends JpaRepository<Especialista, Long>  {

	Especialista findByDni(String dni);
	
	Especialista findByUsuario(Usuario usuario);
	
}
