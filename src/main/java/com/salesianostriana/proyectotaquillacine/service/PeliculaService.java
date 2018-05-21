package com.salesianostriana.proyectotaquillacine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.repo.PeliculaRepository;


@Service
public class PeliculaService {

	@Autowired
	private PeliculaRepository repositorio;
	
	public Iterable <Pelicula> findAll() {
		return repositorio.findAll();
	}
		
	public Pelicula findOne(Long idPelicula) {
		return repositorio.findById(idPelicula).orElse(null);
	}
		
	public Pelicula save(Pelicula p) {
		return repositorio.save(p);
	}
		
	public Pelicula edit(Pelicula p) {
		return repositorio.save(p);
	}
		
	public Pelicula delete(Pelicula p) {
		Pelicula aBorrar = repositorio.findById(p.getIdPelicula()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(p);
			
		return aBorrar;
	}
	
}
