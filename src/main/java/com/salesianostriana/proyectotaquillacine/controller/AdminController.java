package com.salesianostriana.proyectotaquillacine.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.salesianostriana.proyectotaquillacine.service.UsuarioService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private HttpSession session;
	
	@GetMapping({"/", "/indexx"})
	public String welcome(Model model) {
		model.addAttribute("usuario", session.getAttribute("usuarioActual"));
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
	
}