package com.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	 
	 
	
	public List<Produto> findAllByNomeContainingIgnoreCase1(@Param("nome") String nome);
	 
	 
	
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	/*  MySQL: select * from tb_produtos where preco < preco order by preco desc;*/


	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	 /*  MySQL: select * from tb_produtos where preco > preco order by preco;*/


}
