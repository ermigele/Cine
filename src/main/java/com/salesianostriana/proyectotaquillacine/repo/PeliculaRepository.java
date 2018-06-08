package com.salesianostriana.proyectotaquillacine.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {


		/**
	 * Método que devuelve una búsqueda realizada por nombre y le tenemos que pasar
	 * el atributo por el cual deseemos buscar en nuestro caso por nombre y ignora las mayúsculas
	 * y minúsculas
	 * @param nombre Nombre del socio registrado en nuestra base de datos
	 * @return devuelve un socio buscado por nombre
	 */
	public  List<Pelicula> findByTituloContainingIgnoreCase(String titulo);

}

