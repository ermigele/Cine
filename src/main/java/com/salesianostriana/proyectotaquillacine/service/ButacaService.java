package com.salesianostriana.proyectotaquillacine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.repo.ButacaRepository;

@Service
public class ButacaService {

	@Autowired
	private ButacaRepository repositorio;
	
	public Iterable<Butaca> findAll() {
		return repositorio.findAll();
	}
		
	public Butaca findOne(Long idButaca) {
		return repositorio.findById(idButaca).orElse(null);
	}
		
	public Butaca save(Butaca b) {
		return repositorio.save(b);
	}
		
	public Butaca edit(Butaca b) {
		return repositorio.save(b);
	}
		
	public Butaca delete(Butaca b) {
		Butaca aBorrar = repositorio.findById(b.getIdButaca()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(b);
			
		return aBorrar;
	}
	
	
}
