package com.miguel.prueba.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miguel.prueba.mapper.Vendedor_ProductoMapper;
import com.miguel.prueba.modelo.Vendedor_Producto;

@Service("servicioVendedor_Producto")
@Transactional
public class ServicioVendedor_ProductoImpl implements ServicioVendedor_Producto {

	@Autowired
	private Vendedor_ProductoMapper vendedor_productoMapper;

	@Override
	public void insertarVendedor_Producto(Vendedor_Producto vendedor_producto) {
		vendedor_productoMapper.insertarVendedor_Producto(vendedor_producto);
	}
	
	public void eliminarVendedor_Producto(int k_vendedor, int k_producto) {
		vendedor_productoMapper.eliminarVendedor_Producto(k_vendedor, k_producto);
	}

}
