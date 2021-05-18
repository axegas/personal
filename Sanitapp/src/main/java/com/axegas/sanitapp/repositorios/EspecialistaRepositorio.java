package com.axegas.sanitapp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.sanitapp.entidades.Especialista;
import com.axegas.sanitapp.entidades.Usuario;

public interface EspecialistaRepositorio extends JpaRepository<Especialista, Long>  {

	Especialista findByDni(String dni);
	
	Especialista findByUsuario(Usuario usuario);
	
}
