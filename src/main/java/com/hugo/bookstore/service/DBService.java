package com.hugo.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.bookstore.domain.Categoria;
import com.hugo.bookstore.domain.Livro;
import com.hugo.bookstore.repositories.CategoriaRepository;
import com.hugo.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Fantasia", "Livros de aventura");
		Categoria cat3 = new Categoria(null, "Manga", "Manga Shonnem");

		Livro l1 = new Livro(null, "Clean Code ", "Robert Martin", "Lorem ipsum ", cat1);
		Livro l2 = new Livro(null, "Java Como Programar", "Paul Deitel", "Lorem ipsum ", cat1);

		Livro l3 = new Livro(null, "Game of Thrones", " George R. R. Martin", "Lorem ipsum", cat2);
		Livro l4 = new Livro(null, "O Senhor dos Anéis", "J. R. R. Tolkien", "Lorem ipsum", cat2);

		
		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3, l4));
		

		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4));
	}
}
