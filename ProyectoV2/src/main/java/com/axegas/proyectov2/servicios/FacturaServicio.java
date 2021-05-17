package com.axegas.proyectov2.servicios;

import org.springframework.stereotype.Service;

import com.axegas.proyectov2.entidades.Factura;
import com.axegas.proyectov2.repositorios.FacturaRepositorio;
import com.axegas.proyectov2.util.BaseService;

@Service
public class FacturaServicio extends BaseService<Factura, Long, FacturaRepositorio>  {

}
