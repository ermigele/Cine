package com.salesianostriana.proyectotaquillacine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectotaquillacine.model.Entrada;
import com.salesianostriana.proyectotaquillacine.model.LineaPedido;

import com.salesianostriana.proyectotaquillacine.repo.EntradaRepository;

@Service
public class EntradaService {

	@Autowired
	private EntradaRepository repositorio;
	
	public Iterable<Entrada> findAll() {
		return repositorio.findAll();
	}
		
	public Entrada findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
		
	public Entrada save(Entrada e) {
		return repositorio.save(e);
	}
		
	public Entrada edit(Entrada e) {
		return repositorio.save(e);
	}
		
	public Entrada delete(Entrada e) {
		Entrada aBorrar = repositorio.findById(e.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(e);
			
		return aBorrar;
	}
	
}
