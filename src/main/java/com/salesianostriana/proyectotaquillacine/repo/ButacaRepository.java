package com.salesianostriana.proyectotaquillacine.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salesianostriana.proyectotaquillacine.formbean.NuevaSala;
import com.salesianostriana.proyectotaquillacine.model.Butaca;

@Repository
public interface ButacaRepository extends JpaRepository<Butaca, Long> {

	//List<NuevaSala> lista = new ArrayList<NuevaSala>();
	
	
	//@Query("select t from #{#entityName} t where t.attribute = ?1")
	//@Query("SELECT max(numbutacaxfila) as numButacaXFila, max(numfila) as nombreSala, sala_idsala as nombreSala FROM  butaca group by sala_idsala")
	//List<NuevaSala> findAllByAttribute(String attribute);
	
}
