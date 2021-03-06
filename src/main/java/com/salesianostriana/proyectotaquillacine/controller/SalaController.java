package com.salesianostriana.proyectotaquillacine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.proyectotaquillacine.formbean.NuevaSala;
import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.service.ButacaService;
import com.salesianostriana.proyectotaquillacine.service.SalaService;

@Controller
// @RequestMapping("/admin")
public class SalaController {

	@Autowired
	public SalaService salaService;

	@Autowired
	public ButacaService butacaService;

	@GetMapping({ "/nuevaSala" })
	public String mostrarFormSala(Model model) {
		model.addAttribute("nuevaSala", new NuevaSala());

		// model.addAttribute("salitas", salaService.findAll());
		model.addAttribute("butaquitas", butacaService.findAll());

		return "/admin/formularioSala";
	}

	@PostMapping({ "/addSala" })
	public String submit(@ModelAttribute("nuevaSala") NuevaSala nuevaSala, BindingResult bindingResult, Model model) {

		List<Butaca> listButacas = new ArrayList<Butaca>();
        Sala sala = new Sala();
		sala.setNombreSala(nuevaSala.getNombreSala()); // Asigno a la clase Sala la variable nombreSala que recogo del
														// formulario

		salaService.save(sala); // Guardo la sala antes de empezar a meter las butacas

		// Limite de butacas - Datos que entran por el input de HTML
		int butacasXFila = nuevaSala.getNumButacaXFila();
		int numFilas = nuevaSala.getNumFila();

		// Bucleo de mapeo de las salas
		for (int i = 1; i < numFilas+1; i++) {
			for (int j = 1; j < butacasXFila+1; j++) {

				int numFilaActual = i;
				int numButacaActual = j;

				Butaca newButaca = new Butaca();

				newButaca.setNumFila(numFilaActual);
				newButaca.setNumButacaXFila(numButacaActual);

				newButaca.setSala(sala);

				listButacas.add(newButaca);   //añado las butacas a la coleccion de la ArrayList listButacas
				butacaService.save(newButaca); // Guardo las butacas
			}
			
			sala.setListaButacas(listButacas);
			salaService.save(sala);
		}

		return "redirect:/admin/index";
	}

	
	@GetMapping({"/listaSalas"})
	public String mostrarSalas(Model model, Sala sala, Butaca butaca) {
		
		Sala salaActual = new Sala();
		
		List<Butaca> total = salaActual.getListaButacas();
		
		
		Iterable<Sala> find = salaService.findAll();
		
		model.addAttribute("salas", salaActual);
		
	
		
		/*
		int fila = 10;
		int numbutaca = 20;
		
		listBuscas = [
		              ---butaca => fila 5, butaca 3
		              ---butaca => fila 3, butaca 20
		              butaca => fila 10, butaca 20
		              ]
		
	
		for( Butaca objBucata : listBuscas) {
			if(objBucata.getFila> fila)
				fila = bucata.getFila;
			if(objBucata.getNButaca> numbutaca)
				numbutaca = bucata.getNButaca;
			
		} */
		
		//int numSize = listBuscas.size();
		
		//listBuscas.get(numSize-1);
		
		return "admin/listaSalas";
	}
	
	@GetMapping({"/borrarSala/{idSala}"})
	public String eliminarSala(@PathVariable("idSala") long idSala) {
		salaService.delete(salaService.findOne(idSala));
		return "redirect:/admin/listaSalas";
	}
	
	
	@GetMapping({"/editarSala/{idSala}"})

	public String editarSala(@PathVariable("idSala") long idSala, Model model) {
		model.addAttribute("nuevaSala", salaService.findOne(idSala));
		salaService.edit(salaService.findOne(idSala));
		return "admin/formularioSalas";
	}

}
