package com.salesianostriana.proyectotaquillacine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.salesianostriana.proyectotaquillacine.formbean.NuevaPelicula;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sesion;
import com.salesianostriana.proyectotaquillacine.service.ButacaService;
import com.salesianostriana.proyectotaquillacine.service.PeliculaService;
import com.salesianostriana.proyectotaquillacine.service.SalaService;
import com.salesianostriana.proyectotaquillacine.service.SesionService;

@Controller
public class EntradaController {

	@Autowired
	private PeliculaService peliculaService;
	@Autowired
	private SesionService sesionService;
	@Autowired
	ButacaService butacaService;
	
	@GetMapping( "/nuevaEntrada" )
	public String formularioTicket(Model model) {
		Iterable <Pelicula> listaPeliculas = peliculaService.findAll();
		model.addAttribute("peliculas", listaPeliculas);  
		
		
		
		
		model.addAttribute("butacas", butacaService.findAll());
		return "/admin/compraEntrada";
	}
	
	
	
}
