package com.axegas.sanitapp.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axegas.sanitapp.entidades.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>  {
 
	Usuario findByUsername(String username);

}
