package com.miguel.prueba.servicio;

import java.util.List;

import com.miguel.prueba.modelo.Producto;


public interface ServicioProducto {
	public List<Producto> consultarProductos();
	public Producto consultarProductoPorID(int k_producto);
	public void eliminarProducto(int k_producto);
}
