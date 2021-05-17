package com.axegas.proyectov2.servicios;

import org.springframework.stereotype.Service;

import com.axegas.proyectov2.entidades.Producto;
import com.axegas.proyectov2.repositorios.ProductoRepositorio;
import com.axegas.proyectov2.util.BaseService;

@Service
public class ProductoServicio extends BaseService<Producto, Long, ProductoRepositorio> {

}
