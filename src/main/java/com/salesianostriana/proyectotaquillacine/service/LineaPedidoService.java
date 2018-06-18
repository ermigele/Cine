package com.salesianostriana.proyectotaquillacine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectotaquillacine.model.LineaPedido;
import com.salesianostriana.proyectotaquillacine.repo.LineaPedidoRepository;

@Service
public class LineaPedidoService {

	@Autowired
	private LineaPedidoRepository repositorio;
	
	public Iterable<LineaPedido> findAll() {
		return repositorio.findAll();
	}
		
	public LineaPedido findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
		
	public LineaPedido save(LineaPedido l) {
		return repositorio.save(l);
	}
		
	public LineaPedido edit(LineaPedido l) {
		return repositorio.save(l);
	}
		
	public LineaPedido delete(LineaPedido l) {
		LineaPedido aBorrar = repositorio.findById(l.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(l);
			
		return aBorrar;
	}
	
	
}
