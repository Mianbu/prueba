package com.miguel.prueba;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miguel.prueba.modelo.Producto;
import com.miguel.prueba.modelo.Vendedor;
import com.miguel.prueba.servicio.ServicioProducto;
import com.miguel.prueba.servicio.ServicioVendedor;
import com.miguel.prueba.servicio.ServicioVendedor_Producto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	/*
	 * Conectar directamente con el bean
	 */
	@Autowired
	private ServicioVendedor servicioVendedor; 
	@Autowired
	private ServicioProducto servicioProducto;
	@Autowired
	private ServicioVendedor_Producto servicioVendedor_Producto;

	@RequestMapping(value = "/vendedores", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody List<Vendedor> getAllVendedores() {
		return servicioVendedor.consultarVendedores();
	}
	
	@RequestMapping(value = "/vendedorPorID/{k_vendedor}", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody Vendedor getVendedorByID(@PathVariable int k_vendedor) {
		return servicioVendedor.listarVendedoresPorID(k_vendedor);
	}
	
	@RequestMapping(value = "/vendedorProductoPorID/{k_vendedor}", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody List<Producto> getVendedorProductoByID(@PathVariable int k_vendedor) {
		return servicioVendedor.listarProductosPorVendedor(k_vendedor);
	}
	
	@RequestMapping(value = "/vendedorEliminar/{k_vendedor}", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody void deleteVendedor(@PathVariable int k_vendedor) {
		servicioVendedor.eliminarVendedor(k_vendedor);;
	}
	
	@RequestMapping(value = "/productos", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody List<Producto> getAllProductos() {
		return servicioProducto.consultarProductos();
	}
	
	@RequestMapping(value = "/productoPorID/{k_producto}", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody Producto getProductoByID(@PathVariable int k_producto) {
		return servicioProducto.consultarProductoPorID(k_producto);
	}
	
	@RequestMapping(value = "/productoEliminar/{k_producto}", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody void deleteProducto(@PathVariable int k_producto) {
		servicioProducto.eliminarProducto(k_producto);
	}
	
	
}
