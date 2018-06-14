package com.salesianostriana.proyectotaquillacine.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.proyectotaquillacine.formbean.SearchBean;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.service.PeliculaService;
import com.salesianostriana.proyectotaquillacine.service.UsuarioService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private PeliculaService peliculaService;
	@Autowired
	private HttpSession session;
	
	@GetMapping({"/", "/index"})
	public String welcome(Model model) { 
		model.addAttribute("usuario", session.getAttribute("usuarioActual"));
		model.addAttribute("buscarForm", new SearchBean());
		return "admin/index";
	}
	
	@GetMapping({"/listaUsuarios"})
	public String mostrarUsuarios(Model model) {
		
		model.addAttribute("usuarios", usuarioService.findAll());
		return "admin/listaUsuarios";
	}
	
	@GetMapping({"/borrar/{id}"})
	public String eliminarUsuarios(@PathVariable("id") long id) {
		usuarioService.delete(usuarioService.findOne(id));
		return "redirect:/admin/listaUsuarios";
	}
	
	@GetMapping({"/editar/{id}"})
	public String editarUsuarios(@PathVariable("id") long id, Model model) {
		model.addAttribute("registroUser", usuarioService.findOne(id));
		usuarioService.edit(usuarioService.findOne(id));
		return "registroUsuario/registrar";
	}
	
	
	@PostMapping("/buscando")
	  public String buscarPelicula(@ModelAttribute("buscarForm") SearchBean searchBean, Pelicula pelicula,
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