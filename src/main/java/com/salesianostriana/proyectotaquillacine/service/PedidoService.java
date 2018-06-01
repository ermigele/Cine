package com.salesianostriana.proyectotaquillacine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.salesianostriana.proyectotaquillacine.model.Pedido;
import com.salesianostriana.proyectotaquillacine.repo.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repositorio;
	
	public Iterable<Pedido> findAll() {
		return repositorio.findAll();
	}
		
	public Pedido findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
		
	public Pedido save(Pedido p) {
		return repositorio.save(p);
	}
		
	public Pedido edit(Pedido p) {
		return repositorio.save(p);
	}
		
	public Pedido delete(Pedido p) {
		Pedido aBorrar = repositorio.findById(p.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(p);
			
		return aBorrar;
	}
	
}
