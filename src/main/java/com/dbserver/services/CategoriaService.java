package com.dbserver.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbserver.domain.Categoria;
import com.dbserver.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional obj = repo.findById(id);
		return (Categoria) obj.get();
	}

}
