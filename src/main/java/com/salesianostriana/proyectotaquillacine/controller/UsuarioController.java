package com.salesianostriana.proyectotaquillacine.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.salesianostriana.proyectotaquillacine.formbean.SearchBean;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.service.PeliculaService;

@Controller
@RequestMapping("/app")
public class UsuarioController {

	@Autowired
	private HttpSession session;
	@Autowired
	private PeliculaService peliculaService;


	@GetMapping({"/", "/index" })
	public String welcome(Model model) {
		model.addAttribute("usuario", session.getAttribute("usuarioActual"));
		model.addAttribute("buscarForm", new SearchBean());
		return "app/index";
	}
	
	@GetMapping("/pefil")
	public String perfil(Model model) {
		model.addAttribute("loginUser", session.getAttribute("usuarioActual"));
		return "app/perfil";
	}
	
	@PostMapping("/buscar")
	  public String buscarPelicula1(@ModelAttribute("buscarForm") SearchBean searchBean, Pelicula pelicula,
			 Model model){
		
		List<Pelicula> buscarPelis = peliculaService.findByTitulo(searchBean.getSearch());
		
		Pelicula peliEncontrada = null;
		if(buscarPelis.size() > 0) {
			peliEncontrada = buscarPelis.get(0);
		}
		  	
		if(peliEncontrada == null) {
			return "/app/peliculaNoEncontrada";
					
		}else {
			model.addAttribute("detallePelicula", peliEncontrada);
			pelicula.getSesion();
			return "/app/fichaPelicula";
		}
	  }
}
