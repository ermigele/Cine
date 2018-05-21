package com.salesianostriana.proyectotaquillacine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectotaquillacine.model.Sesion;
import com.salesianostriana.proyectotaquillacine.repo.SesionRepository;

@Service
public class SesionService {

	@Autowired
	private SesionRepository repositorio;
	
	public Iterable<Sesion> findAll() {
		return repositorio.findAll();
	}
		
	public Sesion findOne(Long idSesion) {
		return repositorio.findById(idSesion).orElse(null);
	}
		
	public Sesion save(Sesion s) {
		return repositorio.save(s);
	}
		
	public Sesion edit(Sesion s) {
		return repositorio.save(s);
	}
		
	public Sesion delete(Sesion s) {
		Sesion aBorrar = repositorio.findById(s.getIdSesion()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(s);
			
		return aBorrar;
	}
	
}
