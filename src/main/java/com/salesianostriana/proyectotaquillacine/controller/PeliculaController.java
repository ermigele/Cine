package com.salesianostriana.proyectotaquillacine.controller;

import java.time.LocalTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.salesianostriana.proyectotaquillacine.formbean.NuevaPelicula;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.service.PeliculaService;
import com.salesianostriana.proyectotaquillacine.service.SalaService;

@Controller
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;
	@Autowired
	private SalaService salaService;
	
	
	@GetMapping( "/pelicula/{id}" )
	public String detallePelicula(@PathVariable("idPelicula") long idPelicula, Pelicula pelicula, Model model){
		
		Pelicula infoPelicula = peliculaService.findOne(idPelicula);
	
		if(infoPelicula != null) {
			model.addAttribute("detallePelicula", infoPelicula);
			return "detallePelicula";
		}else {
			//Tratamiento del error
			return "Error";
		}
		
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
		model.addAttribute("listaSala", listaSala);					  //añado la sala para mostrar	
		
		
		return "/admin/formularioPelicula";
	}
	
	@PostMapping ( "/addPelicula" )
	public String submit (
			@ModelAttribute("FormPelicula")NuevaPelicula nuevaPelicula, 
			Pelicula pelicula, 
			@RequestParam("file") MultipartFile file, BindingResult bindingResult, Model model ) {
		
		
		
		
		System.out.println(nuevaPelicula.toString());
		System.out.println(nuevaPelicula.getNuevaSala().toString());
		
		for(String sesion : nuevaPelicula.getSesiones() ) {
		System.out.println("Sesiones: "+sesion);
			
		}
		
		//sala.setListaSesiones(listaSesiones);
		
		/*
		salaService.save(sala);
		
		pelicula.setSala(sala);
			
		peliculaService.save(pelicula);
		*/
		
		//if (peliculaService.saveAndUpload(pelicula, file)) {
		if (false) {
			// Éxito en la subida
			return "redirect:/admin/index";
		} else {
			// Error en la subida
			model.addAttribute("uploadError", "Error en la subida de fichero");
			return "redirect:/nuevaPelicula";
		}
	}
	
	
	@GetMapping({"/borrar/{id}"})
	public String eliminarPelicula(@PathVariable("id")long id) {
		peliculaService.delete(peliculaService.findOne(id));
		return "redirect:/admin/index";
		
	}
	
	@GetMapping({"/editar/{id}"})
	public String editarPelicula(@PathVariable("id") long id, Model model) {
		model.addAttribute("nuevaPelicula", peliculaService.findOne(id));
		peliculaService.edit(peliculaService.findOne(id));
		
		return "/admin/formularioPelicula";
	}
	
}
