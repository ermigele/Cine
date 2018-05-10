package com.salesianostriana.proyectotaquillacine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.proyectotaquillacine.service.UsuarioService;

@Controller
public class LoginController {

	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@Autowired
	//private HttpSession session;

	
	@GetMapping ({"/", "/login" })
	public String showLogin(Model model) {
		model.addAttribute("loginUser", new LoginUser());
		return "login";
	}
	
}
