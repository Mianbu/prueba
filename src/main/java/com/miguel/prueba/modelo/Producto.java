package com.miguel.prueba.modelo;

public class Producto {

	String k_producto;
	String n_producto;
	String o_des_prod;
	String o_imagen;

	/*
	public Producto(String n_producto, String o_des_prod, String o_imagen, Vendedor vendedor) {
		this.n_producto = n_producto;
		this.o_des_prod = o_des_prod;
		this.o_imagen = o_imagen;
	}
*/
	public String getK_producto() {
		return k_producto;
	}

	public void setK_producto(String k_producto) {
		this.k_producto = k_producto;
	}

	public String getN_producto() {
		return n_producto;
	}

	public void setN_producto(String n_producto) {
		this.n_producto = n_producto;
	}

	public String getO_des_prod() {
		return o_des_prod;
	}

	public void setO_des_prod(String o_des_prod) {
		this.o_des_prod = o_des_prod;
	}

	public String getO_imagen() {
		return o_imagen;
	}

	public void setO_imagen(String o_imagen) {
		this.o_imagen = o_imagen;
	}

}
