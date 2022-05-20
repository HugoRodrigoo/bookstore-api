package com.hugo.bookstore.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {
	private Integer id;
	private String nome;
	private String discricao;

	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
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

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Categoria(Integer id, String nome, String discricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.discricao = discricao;
	}

}
