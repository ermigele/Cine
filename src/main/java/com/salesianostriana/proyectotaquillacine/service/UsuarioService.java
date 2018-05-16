package com.salesianostriana.proyectotaquillacine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectotaquillacine.model.Usuario;
import com.salesianostriana.proyectotaquillacine.repo.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repositorio;
	
<<<<<<< HEAD
	public Usuario login(String user, String pass) {
		return repositorio.findFirstByUserAndPass(user, pass);
	}
	
	public Iterable<Usuario> findAll() {
		return repositorio.findAll();
	}
	
	public Usuario findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Usuario save(Usuario u) {
		return repositorio.save(u);
	}
	
	public Usuario edit(Usuario u) {
		return repositorio.save(u);
	}
	
	public Usuario delete(Usuario u) {
		Usuario aBorrar = repositorio.findById(u.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(u);
		
		return aBorrar;
	}
=======
	public Iterable<Usuario> findAll() {
		return repositorio.findAll();
	}
	
	public Usuario findOne(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	public Usuario save(Usuario u) {
		return repositorio.save(u);
	}
	
	public Usuario edit(Usuario u) {
		return repositorio.save(u);
	}
	
	public Usuario delete(Usuario u) {
		Usuario aBorrar = repositorio.findById(u.getId()).orElse(null);
		if (aBorrar != null)
			repositorio.delete(u);
		
		return aBorrar;
	}

	public Usuario login(String usuario, String pass) {
		
		return null;
	}
	
>>>>>>> branch 'master' of https://github.com/ermigele/Cine
	
}
	
	
	
	