package com.salesianostriana.proyectotaquillacine.controller;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.salesianostriana.proyectotaquillacine.formbean.NuevaPelicula;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.model.Sesion;
import com.salesianostriana.proyectotaquillacine.service.PeliculaService;
import com.salesianostriana.proyectotaquillacine.service.SalaService;
import com.salesianostriana.proyectotaquillacine.service.SesionService;

@Controller
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;
	@Autowired
	private SalaService salaService;
	@Autowired
	private SesionService sesionService;
	
	@GetMapping("/listadoPeliculas")
	public String listadoPeliculas(Pelicula pelicula, Model model, BindingResult bindingResult ) {
		
		Iterable<Pelicula> listaPelis = peliculaService.findAll();
		
		//List<Pelicula> tmpPelis = new ArrayList<Pelicula>();
		
		for ( Pelicula peli: listaPelis) {
		
			//Pelicula tmp = peli;
			//tmp.setSesion(peli.getSesion());
			peli.getSesion();
			
			//tmpPelis.add(tmp);
		}
		
		model.addAttribute("peliculas", listaPelis );
		
		return "app/cartelera";
	}
	

	@GetMapping("/modificarPeliculas")
	public String modificarPeliculas(Pelicula pelicula, Sala sala, Sesion sesion, Model model, BindingResult bindingResult ) {
		
		Iterable<Pelicula> listPeliculas = peliculaService.findAll();
		model.addAttribute("peliculas",listPeliculas);
		
	
		return "admin/listaPeliculas";
	}
	
	
	@GetMapping( "/pelicula/{idPelicula}" )
	public String detallePelicula(
			//@PathVariable("id") long id,
			@PathVariable("idPelicula") long idPelicula, 
			Pelicula pelicula, Model model){
		
			Pelicula peli = peliculaService.findOne(idPelicula);
			peli.getSesion();
		
			model.addAttribute("detallePelicula", peli);	
			
			return "app/fichaPelicula";
		
	}
		
	
	@GetMapping( "/nuevaPelicula" )
	public String mostrarFormulario(Model model) {
		
		
		model.addAttribute("nuevaPelicula", new NuevaPelicula());
		
		//Creamos un array de String para los generos de las peliculas. Sera para trabajar con el menu desplegable ("Select")
		
		String[] genero = new String [] {"Animación", "Aventuras", "Bélico", "Biográfica", "Ciencia ficción", "Comedia", "Drama", "Fantasía", "Musical", "Romance", "Terror", "Thriller" };
		model.addAttribute("listaGenero", genero);
				
		String[] edad = new String [] {"Todos los publicos", "Menores de 7 años", "Menores de 12 años", "Menores de 16 años", "Menores de 18 años" };
		model.addAttribute("listaEdad", edad);
		
		Iterable<Sala> listaSala = salaService.findAll();  //Recogo la sala
		model.addAttribute("listaSala", listaSala);		  //añado la sala para mostrar	
		
		
		return "/admin/formularioPelicula";
	}
	
	@PostMapping ( "/addPelicula" )
	public String submit (NuevaPelicula nuevaPelicula, Pelicula pelicula, 
			@RequestParam("file") MultipartFile file, BindingResult bindingResult, Model model ) {
		
		
		pelicula.setTitulo(nuevaPelicula.getTitulo());
		pelicula.setDirector(nuevaPelicula.getDirector());
		pelicula.setGenero(nuevaPelicula.getGenero());
		pelicula.setEdad(nuevaPelicula.getEdad());
		pelicula.setEstreno(nuevaPelicula.getEstreno());
		pelicula.setDuracion(nuevaPelicula.getDuracion());
		pelicula.setSala(nuevaPelicula.getNuevaSala());
		
		
		
		///AHORA GUARDAR PELICULA
		peliculaService.save(pelicula);
		
		List<Sesion> listSesiones = new ArrayList<Sesion>();
		
		for(String sesion : nuevaPelicula.getSesiones() ) {
			System.out.println("Sesiones: "+sesion);
			

			LocalTime nuevoTimeSesion = LocalTime.parse(sesion); //Recoge el bucle de las sesiones y lo parsea de String a LocalTime
			
			Sesion nuevaSesion = new Sesion();   //Instanciando Object Sesion
			
			nuevaSesion.setHoraSesion(nuevoTimeSesion);  //Cuando tienes el objeto en LocalTime le haces un Set a Sesion
			
			nuevaSesion.setSala(nuevaPelicula.getNuevaSala());  //Haces Set a la Sala
			nuevaSesion.setPelicula(pelicula);                 //Haces Set a la Pelicula
			
			sesionService.save(nuevaSesion);
			listSesiones.add(nuevaSesion);
		}
		
		
		Set<Sesion> setSesions = new HashSet<Sesion>(listSesiones);
		
		pelicula.setSesion(setSesions);
	
		peliculaService.save(pelicula);

		
		if (peliculaService.saveAndUpload(pelicula, file)) {
			// Éxito en la subida
			return "redirect:/admin/index";
		} else {
			// Error en la subida
			model.addAttribute("uploadError", "Error en la subida de fichero");
			return "redirect:/nuevaPelicula";
		}
	}
	
	
	@GetMapping({"/borrar/{idPelicula}"})
	public String eliminarPelicula(@PathVariable("idPelicula")long idPelicula) {
		peliculaService.delete(peliculaService.findOne(idPelicula));
		return "redirect:/admin/listaPeliculas";
		
	}
	
	@GetMapping({"/editar/{idPelicula}"})
	public String editarPelicula(@PathVariable("idPelicula") long idPelicula, Model model) {
		model.addAttribute("nuevaPelicula", peliculaService.findOne(idPelicula));
		peliculaService.edit(peliculaService.findOne(idPelicula));
		
		return "/admin/formularioPelicula";  
	}
		
}
