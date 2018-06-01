package com.salesianostriana.proyectotaquillacine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sala;

import com.salesianostriana.proyectotaquillacine.repo.SalaRepository;

@Service
public class SalaService {
		
	@Autowired
	private SalaRepository repositorio;
	
	public Iterable<Sala> findAll() {
		return repositorio.findAll();
	}
	
	
	public Sala findOne(Long idSala) {
		return repositorio.findById(idSala).orElse(null);
		//return repositorio.findById(idSala).orElse(null);
		//return repositorio.find
	}
		
	public Sala save(Sala s) {
		return repositorio.save(s);
	}
		
	public Sala edit(Sala s) {
		return repositorio.save(s);
	}
		
	public Sala delete(Sala s) {
		Sala aBorrar = repositorio.findById(s.getIdSala()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(s);
			
		return aBorrar;
	}
	
	

}
