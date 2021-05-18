package com.axegas.sanitapp.servicios;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.axegas.sanitapp.entidades.Usuario;
import com.axegas.sanitapp.repositorios.UsuarioRepositorio;
import com.axegas.sanitapp.util.BaseService;

@Service
public class UsuarioServicio extends BaseService<Usuario, Long, UsuarioRepositorio> implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) {
		return repositorio.findByUsername(username);
	}

}
