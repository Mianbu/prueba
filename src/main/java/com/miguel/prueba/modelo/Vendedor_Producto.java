package com.miguel.prueba.modelo;

public class Vendedor_Producto {

	private Vendedor vendedor;
	private Producto producto;

	public Vendedor_Producto(Vendedor vendedor, Producto producto) {
		this.vendedor = vendedor;
		this.producto = producto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
