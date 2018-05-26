package com.salesianostriana.proyectotaquillacine.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.proyectotaquillacine.model.EntidadConFichero;
/**
 * Un repositorio típico de Spring Data JPA
 * 
 * @author luismi
 *
 */
@Repository
public interface EntidadConFicheroRepository extends JpaRepository<EntidadConFichero, Long> {

}

