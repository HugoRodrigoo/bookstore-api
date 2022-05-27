package com.hugo.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hugo.bookstore.domain.Livro;
import com.hugo.bookstore.repositories.LivroRepository;
import com.hugo.bookstore.service.exepitions.ObjectNotFoundException;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Livro não encontrado !! id: "+ id + " Tipo: "+ Livro.class.getName()));
 	}
}
