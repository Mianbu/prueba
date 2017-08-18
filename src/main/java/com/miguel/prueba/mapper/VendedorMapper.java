package com.miguel.prueba.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.miguel.prueba.modelo.Producto;
import com.miguel.prueba.modelo.Vendedor;

@Mapper
public interface VendedorMapper {
	@Results({ 
		@Result(property = "k_vendedor", column = "k_vendedor"),
		@Result(property = "n_nom_pr_ven", column = "n_nom_pr_ven"),
		@Result(property = "n_nom_sg_ven", column = "n_nom_sg_ven"),
		@Result(property = "n_ape_pr_ven", column = "n_ape_pr_ven"),
		@Result(property = "n_ape_sg_ven", column = "n_ape_sg_ven") 
		})
	@Select("SELECT * FROM vendedor")
	public List<Vendedor> listarVendedores();
	
	@Select("SELECT * FROM vendedor WHERE k_vendedor = #{k_vendedor}")
	public Vendedor listarVendedoresPorID(int k_vendedor);
	
	@Select("SELECT * FROM producto p, vendedor_producto vp WHERE vp.k_vendedor = #{k_vendedor} AND vp.k_producto = p.k_producto")
	public List<Producto> listarProductosPorVendedor(int k_vendedor);

	@Insert("INSERT INTO vendedor (n_nom_pr_ven, n_nom_sg_ven, n_ape_pr_ven, n_ape_sg_ven) VALUES (#{n_nom_pr_ven},#{n_nom_sg_ven},#{n_ape_pr_ven},#{n_ape_sg_ven})")
	public void insertarVendedor(Vendedor vendedor);

	@Update("UPDATE vendedor SET n_nom_pr_ven = #{n_nom_pr_ven}, n_nom_sg_ven = #{n_nom_sg_ven}, n_ape_pr_ven = #{n_ape_pr_ven}, n_ape_sg_ven = #{n_ape_sg_ven} WHERE k_vendedor = #{k_vendedor}")
	public void actualizarVendedor(int k_vendedor, Vendedor vendedor);

	@Delete("DELETE FROM vendedor WHERE k_vendedor = #{k_vendedor}")
	public void eliminarVendedor(int k_vendedor);

}
