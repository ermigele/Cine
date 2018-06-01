package com.salesianostriana.proyectotaquillacine.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sesion;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Long> {

	//@Query("select u from Usuario u where u.user = ?1 and u.pass = ?2")
		//public Usuario buscaPorLoginYPassword(String user, String password);
	
	//@Query("SELECT u FROM ")
	//public Sesion findSesionDePelicula(Pelicula idPelicula);
	
	@Query ("SELECT u FROM Sesion u WHERE pelicula = ?1 ")
	public Iterable<Sesion> findBySesionDePelicula(Pelicula pelicula);
}

