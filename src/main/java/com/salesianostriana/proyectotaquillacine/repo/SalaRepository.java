package com.salesianostriana.proyectotaquillacine.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.proyectotaquillacine.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala,Long> {


}
