package com.salesianostriana.proyectotaquillacine.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.proyectotaquillacine.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//@Query("select u from Usuario u where u.user = ?1 and u.pass = ?2")
	//public Usuario buscaPorLoginYPassword(String user, String password);
	
	public Usuario findFirstByUserAndPass(String user, String pass);


}
