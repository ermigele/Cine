package com.salesianostriana.proyectotaquillacine.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.proyectotaquillacine.formbean.NuevaSala;
import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.service.SalaService;

public class SalaController {

	
	@Autowired
	public SalaService salaService;
	
	
	@GetMapping({"nuevaSala"})
	public String mostrarFormSala (Model model){
		model.addAttribute("nuevaSala", new NuevaSala());
		return "/admin/formularioSala";
		
		
	}
	
	@PostMapping({"addSala"})
	public String submit (@ModelAttribute("nuevaSala") NuevaSala nuevaSala, BindingResult bindingResult, Model model ) {
		
		Sala sala = new Sala ();
		sala.setNombreSala(nuevaSala.getNombreSala());
		
		//Guardo la sala antes de empezar a meter las butacas
		salaService.save(sala);
		
		//limite de butacas - datos que entran por HTML
		int butacasXFila = nuevaSala.getNumButacaXFila();
		int numFilas = nuevaSala.getNumFila();
		
		//bucleo de mapeo de las salas
		for(int i = 0; i<numFilas;i++) {
			for(int j=0; j< butacasXFila;j++) {
				
				int numFilaActual = i;
				int numButacaActual = j;
				
				Butaca newButaca = new Butaca();
				
				newButaca.setFila(numFilaActual);
				newButaca.setNumButaca(numButacaActual);	
			
		newButaca.setSala(sala);
		
						
			//butacaService.save(newButaca);
			
			}
		}
		
		return "redirect:app/index";
	}
}
