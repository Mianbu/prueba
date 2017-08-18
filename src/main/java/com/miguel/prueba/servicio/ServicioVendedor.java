package com.miguel.prueba.servicio;

import java.util.List;

import com.miguel.prueba.modelo.Producto;
import com.miguel.prueba.modelo.Vendedor;

public interface ServicioVendedor {
	public List<Vendedor> consultarVendedores();
	public Vendedor listarVendedoresPorID(int k_vendedor);
	public List<Producto> listarProductosPorVendedor(int k_vendedor);
	public void eliminarVendedor(int k_vendedor);
}
