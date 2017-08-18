package com.miguel.prueba.servicio;

import com.miguel.prueba.modelo.Vendedor_Producto;

public interface ServicioVendedor_Producto {

	public void insertarVendedor_Producto(Vendedor_Producto vendedor_producto);
	public void eliminarVendedor_Producto(int k_vendedor, int k_producto);
}
