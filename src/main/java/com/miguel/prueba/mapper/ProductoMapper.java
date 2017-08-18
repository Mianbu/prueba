package com.miguel.prueba.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;

import com.miguel.prueba.modelo.Producto;

public interface ProductoMapper {
	@Results({ 
			@Result(property = "k_producto", column = "k_producto"),
			@Result(property = "n_producto", column = "n_producto"),
			@Result(property = "o_des_prod", column = "o_des_prod"),
			@Result(property = "o_imagen", column = "o_imagen") 
			})

	@Select("SELECT * FROM producto")
	public List<Producto> listarProductos();

	@Select("SELECT * FROM producto WHERE k_producto = #{k_producto}")
	public Producto listarProductosPorID(int k_producto);

	@Insert("INSERT INTO producto (n_producto, o_des_producto, o_imagen) VALUES (#{n_producto},#{o_des_prod},#{o_imagen})")
	public void insertarProducto(Producto producto);

	@Update("UPDATE producto SET n_producto = #{n_producto}, o_des_prod = #{o_des_prod}, o_imagen = #{o_imagen} WHERE k_producto = #{k_producto}")
	public void actualizarProducto(int k_producto, Producto producto);

	@Delete("DELETE FROM producto WHERE k_producto = #{k_producto}")
	public void eliminarProducto(int k_producto);
}
