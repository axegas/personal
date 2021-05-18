package com.axegas.sanitapp.servicios;

import org.springframework.stereotype.Service;

import com.axegas.sanitapp.entidades.Factura;
import com.axegas.sanitapp.repositorios.FacturaRepositorio;
import com.axegas.sanitapp.util.BaseService;

@Service
public class FacturaServicio extends BaseService<Factura, Long, FacturaRepositorio>  {

}
