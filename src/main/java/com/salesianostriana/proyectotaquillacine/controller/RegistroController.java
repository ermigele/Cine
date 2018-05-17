package com.salesianostriana.proyectotaquillacine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.proyectotaquillacine.model.Usuario;
import com.salesianostriana.proyectotaquillacine.service.UsuarioService;

@Controller
public class RegistroController {

	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping({ "/", "/registrar"})
	public String mostrarRegistro(Model model) {	
		model.addAttribute("loginUser", new Usuario());
		return "registro";
	}
	
	@PostMapping({"/registrar"})
	public String registrar(Model model, @ModelAttribute Usuario user, BindingResult bindingResult) {
		usuarioService.save(user);
		
		return "redirect: /login";
	}
	
}
