package com.axegas.proyectov2.servicios;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.axegas.proyectov2.entidades.Usuario;
import com.axegas.proyectov2.repositorios.UsuarioRepositorio;
import com.axegas.proyectov2.util.BaseService;

@Service
public class UsuarioServicio extends BaseService<Usuario, Long, UsuarioRepositorio> implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) {
		return repositorio.findByUsername(username);
	}

}
