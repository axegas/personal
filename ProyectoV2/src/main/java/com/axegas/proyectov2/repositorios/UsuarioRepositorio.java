package com.axegas.proyectov2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.proyectov2.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>  {
 
	Usuario findByUsername(String username);

}
