package com.hugo.bookstore.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.hugo.bookstore.domain.Categoria;

public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "Campo Nome é Requerido")
	@Length(min = 3, max = 100, message = "O campo Nome deve ter entre 3 e 100 caracteres")
	private String nome;
	@NotEmpty
	@Length(min = 3, max = 200, message = "o campo Discricão deve ter entre 3 e 200 caracteres")
	private String discricao;
	public CategoriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.discricao = obj.getDiscricao();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDiscricao() {
		return discricao;
	}
	public void setDiscricao(String discricao) {
		this.discricao = discricao;
	}
}
