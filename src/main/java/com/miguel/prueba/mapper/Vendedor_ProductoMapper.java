package com.miguel.prueba.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.miguel.prueba.modelo.Vendedor_Producto;

public interface Vendedor_ProductoMapper {
	@Results({ 
		@Result(property = "k_vendedor", column = "k_vendedor"),
		@Result(property = "k_producto", column = "k_producto")
		})
	
	@Select("INSERT INTO vendedor_producto (k_vendedor, k_producto) VALUES (#{k_vendedor},#{k_producto})")
	public void insertarVendedor_Producto(Vendedor_Producto vendedor_producto);
	
	@Delete("DELETE FROM vendedor_producto WHERE k_vendedor = #{k_vendedor} AND k_producto = #{k_producto}")
	public void eliminarVendedor_Producto(int k_vendedor, int k_producto);
}
