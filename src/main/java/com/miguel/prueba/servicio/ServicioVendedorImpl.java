package com.miguel.prueba.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miguel.prueba.mapper.VendedorMapper;
import com.miguel.prueba.modelo.Producto;
import com.miguel.prueba.modelo.Vendedor;

@Service("servicioVendedor")
@Transactional
public class ServicioVendedorImpl implements ServicioVendedor {
	@Autowired
	private VendedorMapper vendedorMapper;

	@Override
	public List<Vendedor> consultarVendedores() {
		List<Vendedor> listaVendedores = vendedorMapper.listarVendedores();
		return listaVendedores;
	}

	@Override
	public Vendedor listarVendedoresPorID(int k_vendedor) {
		Vendedor vendedor = vendedorMapper.listarVendedoresPorID(k_vendedor);
		return vendedor;
	}

	@Override
	public void eliminarVendedor(int k_vendedor) {
		vendedorMapper.eliminarVendedor(k_vendedor);
	}

	@Override
	public List<Producto> listarProductosPorVendedor(int k_vendedor) {
		List <Producto> listaProductos = vendedorMapper.listarProductosPorVendedor(k_vendedor);
		return listaProductos;
	}

}
