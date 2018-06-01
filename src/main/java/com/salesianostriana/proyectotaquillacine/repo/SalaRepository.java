package com.salesianostriana.proyectotaquillacine.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala,Long> {

	//@Query("select u from Usuario u where u.user = ?1 and u.pass = ?2")
	//@Query("SELECT max(b.numbutacaxfila)+1 as numButacaXFila, max(b.numfila)+1 as numFila, s.nombresala as nombreSala from Butaca b left join Sala s on s.idsala = b.sala_idsala  group by b.sala_idsala")
	//public List<NuevaSala> dameSalas();
	
	//@Query("select u from Usuario u where u.user = ?1 and u.pass = ?2")
			//public Usuario buscaPorLoginYPassword(String user, String password);
}