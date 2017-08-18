package com.miguel.prueba.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miguel.prueba.mapper.ProductoMapper;
import com.miguel.prueba.modelo.Producto;

@Service("servicioProducto")
@Transactional
public class ServicioProductoImpl implements ServicioProducto{

	@Autowired
	private ProductoMapper productoMapper;

	@Override
	public List<Producto> consultarProductos() {
		List <Producto> listaProductos = productoMapper.listarProductos();
		return listaProductos;
	}

	@Override
	public Producto consultarProductoPorID(int k_producto) {
		Producto producto = productoMapper.listarProductosPorID(k_producto);
		return producto;
	}

	@Override
	public void eliminarProducto(int k_producto) {
		productoMapper.eliminarProducto(k_producto);
	}	
	
}
