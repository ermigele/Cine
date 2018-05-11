package com.salesianostriana.proyectotaquillacine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.proyectotaquillacine.model.Pelicula;

@Controller
public class PeliculaController {

	
	@GetMapping("/pelicula/{id}")
	public String detallePeliucla(@PathVariable("id") long id, Model model) {
		
		Pelicula p = peliculaService.obtenerUnaPelicula(id);
		
		if(p != null) {
			model.addAttribute("pelicula",p);
			return "DetalleProducto";
		}else {
			//tratamiento del error
			return "Error";
		}
		
	}
		
	@GetMapping("/NuevaPelicula")
	public String mostrarFormulario(Model model) {
		
		Pelicula p = new Pelicula();
		model.addAttribute("FormPelicula", pelicula);
			
		return "form";
	}
	
	
	@PostMapping ("/addPelicula")
	public String submit(@ModeAttribute("FormPelicula")) {
		model.addAttribute("pelicula", pelicula);
		return "peliculas";
	}
	
	
}
