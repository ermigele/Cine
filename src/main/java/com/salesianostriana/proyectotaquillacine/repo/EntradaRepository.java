package com.salesianostriana.proyectotaquillacine.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.proyectotaquillacine.model.Entrada;

@Repository
public interface EntradaRepository extends JpaRepository<Entrada, Long> {

}
