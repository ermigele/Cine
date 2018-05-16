package com.salesianostriana.proyectotaquillacine.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

<<<<<<< HEAD
import com.salesianostriana.proyectotaquillacine.formbean.LoginUser;
=======
>>>>>>> branch 'master' of https://github.com/ermigele/Cine
import com.salesianostriana.proyectotaquillacine.model.Usuario;
import com.salesianostriana.proyectotaquillacine.service.UsuarioService;

@Controller
public class LoginController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private HttpSession session;
	
	@GetMapping({ "/", "/login" })
<<<<<<< HEAD
	public String mostrarogin(Model model) {
=======
	public String showLogin(Model model) {
>>>>>>> branch 'master' of https://github.com/ermigele/Cine
		model.addAttribute("loginUser", new LoginUser());
		return "login";

	}
	
<<<<<<< HEAD
	@PostMapping("/verificarLogin")
	public String verificarLogin (@ModelAttribute("loginUser") LoginUser loginUser, BindingResult bindingResult, Model model) {

		Usuario user = usuarioService.login(loginUser.getUsuario(), loginUser.getPass());

		if (user != null && user.isAdmin()) {

			session.setAttribute("Usuario", user);
			return "redirect:/admin/index";
		} else if (user != null) {
			session.setAttribute("Usuario", user);
			return "redirect:/app/index";
		} else {
			model.addAttribute("loginError", "El usuario o contraseña no es válido");
			return "login";
		}

	}
	
	@GetMapping("/cerrarSesion")
	public String cerrarSesion (Model model) {
		session.setAttribute("Usuario", null);
		return "redirect:/";
	}
	

}
=======
	@PostMapping("/checkLogin")
	public String doLogin(@ModelAttribute("loginUser") LoginUser loginUser, BindingResult bindingResult, Model model) {

		Usuario user = usuarioService.login(loginUser.getUsuario(), loginUser.getPass());

		if (user != null && user.isAdmin()) {

			session.setAttribute("usuarioActual", user);
			return "redirect:/admin/index";
		} else if (user != null) {
			session.setAttribute("usuarioActual", user);
			return "redirect:/app/index";
		} else {
			model.addAttribute("loginError", "El usuario o contraseña no es válido");
			return "login";
		}

	}
	
	@GetMapping("/logout")
	public String doLogout(Model model) {
		session.setAttribute("usuarioActual", null);
		return "redirect:/";
	}
	

}
>>>>>>> branch 'master' of https://github.com/ermigele/Cine
