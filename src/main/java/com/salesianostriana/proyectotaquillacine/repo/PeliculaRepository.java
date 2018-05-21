package com.salesianostriana.proyectotaquillacine.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.proyectotaquillacine.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

}
