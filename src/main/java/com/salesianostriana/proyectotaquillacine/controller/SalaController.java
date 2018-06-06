package com.salesianostriana.proyectotaquillacine.controller;

import java.util.ArrayList;

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

				butacaService.save(newButaca); // Guardo las butacas
			}
			
			
		}

		return "redirect:/admin/index";
	}

	
	@GetMapping({"/listaSalas"})
	public String mostrarSalas(Model model) {
		
		model.addAttribute("salas", salaService.findAll());
		return "admin/listaSalas";
	}
	
	/*
	@GetMapping({"/borrar/{id}"})
	public String eliminarSala(@PathVariable("id") long id) {
		salaService.delete(salaService.findOne(id));
		return "redirect:/admin/listaSalas";
	}
	
	*/
	
	/*
	 * @GetMapping({"/editar/{id}"})

	public String editarSala(@PathVariable("id") long id, Model model) {
		model.addAttribute("nuevaSala", salaService.findOne(id));
		salaService.edit(salaService.findOne(id));
		return "admin/formularioSalas";
	}
	
		 */
}
