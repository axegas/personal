package com.axegas.sanitapp.servicios;

import org.springframework.stereotype.Service;

import com.axegas.sanitapp.entidades.Producto;
import com.axegas.sanitapp.repositorios.ProductoRepositorio;
import com.axegas.sanitapp.util.BaseService;

@Service
public class ProductoServicio extends BaseService<Producto, Long, ProductoRepositorio> {

}
