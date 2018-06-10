package com.salesianostriana.proyectotaquillacine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.proyectotaquillacine.formbean.NuevaPelicula;
import com.salesianostriana.proyectotaquillacine.formbean.NuevoTicket;
import com.salesianostriana.proyectotaquillacine.formbean.SearchBean;
import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.model.Sesion;
import com.salesianostriana.proyectotaquillacine.service.ButacaService;
import com.salesianostriana.proyectotaquillacine.service.PeliculaService;
import com.salesianostriana.proyectotaquillacine.service.SesionService;

@Controller
public class EntradaController {

	@Autowired
	private PeliculaService peliculaService;
	@Autowired
	private SesionService sesionService;
	@Autowired
	ButacaService butacaService;
	
	@GetMapping( "/nuevaEntrada/{idSesion}" )
	public String formularioTicket(@PathVariable("idSesion") long idSesion, Model model){

		model.addAttribute("nuevoTicket", new NuevoTicket());
		
		Sesion sesionActual = sesionService.findOne(idSesion);
		model.addAttribute("sesion", sesionActual);
		
		Sala salaActual =  sesionActual.getSala();
		model.addAttribute("sala", salaActual);
		
		List<Butaca> butacaActual = salaActual.getListaButacas();
		
		for(Butaca buta : butacaActual) {
			System.out.println("Butaca: "+buta);
		}
		
		model.addAttribute("butacasDeLaSala", butacaActual);
		
		return "/admin/ticket";
	}
	
	
	@PostMapping ("/addEntrada")
	public String envioTicket(@ModelAttribute("ticketForm") NuevoTicket nuevoTicket, Model model) {
		
		
		
		
		
		return null;
		
		
		
	}
	
	
}
