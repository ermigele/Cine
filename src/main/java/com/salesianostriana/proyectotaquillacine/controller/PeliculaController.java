package com.salesianostriana.proyectotaquillacine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.salesianostriana.proyectotaquillacine.formbean.NuevaPelicula;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.service.PeliculaService;

@Controller
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;
	
	
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
		
		model.addAttribute("FormPelicula", new NuevaPelicula());
		return "/formularioPelicula";
	}
	
	
	@PostMapping ( "/addPelicula" )
	public String submit (@ModelAttribute("FormPelicula") Pelicula pelicula, BindingResult bindingResult, Model model ) {
		
		peliculaService.save(pelicula);
		return "redirect: /admin/index";
	}	
	
}
