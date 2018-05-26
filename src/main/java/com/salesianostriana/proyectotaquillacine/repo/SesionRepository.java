package com.salesianostriana.proyectotaquillacine.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.proyectotaquillacine.model.Sesion;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Long> {

}
