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
import com.salesianostriana.proyectotaquillacine.formbean.NuevoTicket;
import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.model.Entrada;
import com.salesianostriana.proyectotaquillacine.model.LineaPedido;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.model.Sesion;
import com.salesianostriana.proyectotaquillacine.service.ButacaService;
import com.salesianostriana.proyectotaquillacine.service.EntradaService;
import com.salesianostriana.proyectotaquillacine.service.SesionService;

@Controller
public class EntradaController {

	@Autowired
	private SesionService sesionService;
	@Autowired
	ButacaService butacaService;
	@Autowired
	EntradaService entradaService;
	
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
	public String submit(@ModelAttribute("nuevoTicket") NuevoTicket nuevoTicket, LineaPedido lineapedido,  BindingResult bindingResult, Model model) {
					
		List<NuevoTicket> tickets = new ArrayList<NuevoTicket>();
		NuevoTicket tmpTick = new NuevoTicket();
		
		long idSesion = 304;
		
		Sesion sesionActual = new Sesion();
		
		sesionService.findOne(idSesion);
		sesionActual.setIdSesion(idSesion);
		sesionService.save(sesionActual);
		
		
		for (Butaca butaquitas : nuevoTicket.getListaButacas()) {
			
			System.out.println(butaquitas.getIdButaca() + " "
					+ ""+ butaquitas.getNumFila()
					+ ""+ butaquitas.getNumButacaXFila());
			
		 	tmpTick.setButacaLlena(butaquitas);
		 	tmpTick.setIdSesion(nuevoTicket.getIdSesion());
		 	tickets.add(tmpTick);
		}
	
		
		model.addAttribute("ticketGuardar",new NuevoTicket());
		model.addAttribute("tickets",tickets);
		
		return "/admin/finalizarPedido";
		
	}
	
	
	@GetMapping ("/finalizarPedido")
	public String mostrarPedido(@ModelAttribute("tickets") NuevoTicket nuevoTicket,  BindingResult bindingResult, Model model) {
		
		
		for (Butaca butaquitas : nuevoTicket.getListaButacas()) {
			System.out.println(butaquitas.getIdButaca() + " "
					+ ""+ butaquitas.getNumFila()
					+ ""+ butaquitas.getNumButacaXFila());
		}
		
		
		return "redirect:/admin/index";
		
	}
	
}
