package com.mjv.grupo1.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjv.grupo1.livraria.model.library.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

	Livro findByTituloIgnoreCase(String titulo);
	
	void deleteByTituloIgnoreCase(String titulo);
}
