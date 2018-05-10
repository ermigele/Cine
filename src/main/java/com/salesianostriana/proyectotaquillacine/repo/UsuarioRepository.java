package com.salesianostriana.proyectotaquillacine.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.proyectotaquillacine.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//@Query("select u from Usuario u where u.username = ?1 and u.pass = ?2")
	//public Usuario buscaPorLoginYPassword(String username, String password);
	
	public Usuario findFirstByUsernameAndPass(String username, String pass);


}

