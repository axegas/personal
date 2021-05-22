package com.axegas.sanitapp.servicios;

import org.springframework.stereotype.Service;

import com.axegas.sanitapp.entidades.Cita;
import com.axegas.sanitapp.repositorios.CitaRepositorio;
import com.axegas.sanitapp.util.BaseService;

@Service
public class CitaServicio extends BaseService<Cita, Long, CitaRepositorio> {
}
