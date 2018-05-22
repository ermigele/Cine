package com.salesianostriana.proyectotaquillacine.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.salesianostriana.proyectotaquillacine.formbean.NuevaSala;
import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.service.ButacaService;
import com.salesianostriana.proyectotaquillacine.service.SalaService;

@Controller
public class SalaController {

	
	@Autowired
	public SalaService salaService;
	
	@Autowired
	public ButacaService butacaService;
	
	
	@GetMapping({"nuevaSala"})
	public String mostrarFormSala (Model model){
		model.addAttribute("nuevaSala", new NuevaSala());
		return "/admin/formularioSala";
		//return "/admin/test";
		
	}
	
	
	@PostMapping({"addSala"})
	public String submit (@ModelAttribute("nuevaSala") NuevaSala nuevaSala, BindingResult bindingResult, Model model ) {
		
		Sala sala = new Sala ();
		sala.setNombreSala(nuevaSala.getNombreSala()); //
		
		
		salaService.save(sala); //Guardo la sala antes de empezar a meter las butacas
		
		//Limite de butacas - Datos que entran por el input de HTML
		int butacasXFila = nuevaSala.getNumButacaXFila();
		int numFilas = nuevaSala.getNumFila();
		
		//Bucleo de mapeo de las salas
		for(int i = 0; i<numFilas;i++) {
			for(int j=0; j< butacasXFila;j++) {
				
				int numFilaActual = i;
				int numButacaActual = j;
				
				Butaca newButaca = new Butaca();
				
				newButaca.setFila(numFilaActual);
				newButaca.setNumButaca(numButacaActual);	
			
		newButaca.setSala(sala);
		
						
			butacaService.save(newButaca); //Guardo las butacas		
			}
		}
		
		return "redirect:app/index";
	}
}
