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
import com.salesianostriana.proyectotaquillacine.model.Pedido;
import com.salesianostriana.proyectotaquillacine.service.ButacaService;
import com.salesianostriana.proyectotaquillacine.service.EntradaService;
import com.salesianostriana.proyectotaquillacine.service.LineaPedidoService;
import com.salesianostriana.proyectotaquillacine.service.PedidoService;
import com.salesianostriana.proyectotaquillacine.service.SesionService;

@Controller
public class EntradaController {

	@Autowired
	private SesionService sesionService;
	@Autowired
	ButacaService butacaService;
	@Autowired
	EntradaService entradaService;
	@Autowired
	LineaPedidoService lineaPedidoService;
	@Autowired
	PedidoService pedidoService;
	

	
	@GetMapping( "/nuevaEntrada/{idSesion}" )
	public String formularioTicket(@PathVariable("idSesion") long idSesion, Model model){

		NuevoTicket n1 = new NuevoTicket(); 
		
		n1.setIdSesion(idSesion);
		model.addAttribute("nuevoTicket", n1);
		
		Sesion sesionActual = sesionService.findOne(idSesion);
		model.addAttribute("sesion", sesionActual);
		
		Sala salaActual =  sesionActual.getSala();
		model.addAttribute("sala", salaActual);
		
		List<Butaca> butacaActual = salaActual.getListaButacas();
		
		model.addAttribute("butacasDeLaSala", butacaActual);
		
		return "/app/ticket";
	}
	
	
	@PostMapping ("/addEntrada")
	public String submit(@ModelAttribute("nuevoTicket") NuevoTicket nuevoTicket, BindingResult bindingResult, Model model) {
		
		NuevoTicket ticketEnviar = new NuevoTicket();
		Entrada e1 = new Entrada();
		LineaPedido l1 = new LineaPedido();
		Pedido p1 = new Pedido();
		
		Sesion s1 = sesionService.findOne(nuevoTicket.getIdSesion());
		ticketEnviar.setSala(s1.getSala());
		ticketEnviar.setPelicula(s1.getPelicula());
		ticketEnviar.setSesion(s1);
		
		List<Butaca> listButacaSelec = new ArrayList<Butaca>();
		for (Butaca butaquitas : nuevoTicket.getListaButacas()) {
			listButacaSelec.add(butaquitas);
			
			e1.setButaca(butaquitas);
			
		}

		ticketEnviar.setListaButacas(listButacaSelec);
		model.addAttribute("ticketButacas", ticketEnviar);
		
		
		NuevoTicket saveButac= new NuevoTicket();
	
		saveButac.setIdSesion(111);
		List<Butaca> bu = new ArrayList<Butaca>();
		Butaca n1 = new Butaca();
		n1.setIdButaca(101);
		bu.add(n1);
		
		saveButac.setIdSesion(111);
		saveButac.setListaButacas(bu);
		
		model.addAttribute("ticketSaveButaca", saveButac);

		e1.setSesion(s1);
		l1.setEntrada(e1);
		e1.setLineaPedido(l1);
		l1.setEntrada(e1);
		l1.setPrecioUnitario(nuevoTicket.getPrecio());
				
		List<LineaPedido> listLinea = new ArrayList<LineaPedido>();
		
		
		//Pedido pedidoService.save(p1);
		//lineaPedidoService.save(l1);
		//entradaService.save(e1);
		
		
		return "/app/finalizarPedido";
		
		
	}
	
	
	@PostMapping ("/finalizarTickect")
	public String Pedido(@ModelAttribute("ticketSaveButaca") NuevoTicket nuevoTicket, LineaPedido lineaPedido, BindingResult bindingResult, Model model) {
	
	

		
		
		
		
		
		return "redirect:/app/cartelera";
		
	}
	
}
