package com.salesianostriana.proyectotaquillacine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.salesianostriana.proyectotaquillacine.formbean.NuevaPelicula;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.service.PeliculaService;

@Controller
public class PeliculaController {
	
	@Autowired
	private PeliculaService peliculaService;
	
	
	@GetMapping( "/pelicula/{id}" )
	public String detallePelicula(@PathVariable("idPelicula") long idPelicula, Pelicula pelicula, Model model){
		
		Pelicula infoPelicula = peliculaService.findOne(idPelicula);
	
		if(infoPelicula != null) {
			model.addAttribute("detallePelicula", infoPelicula);
			return "detallePelicula";
		}else {
			//Tratamiento del error
			return "Error";
		}
		
	}
		
	@GetMapping( "/nuevaPelicula" )
	public String mostrarFormulario(Model model) {
		
		model.addAttribute("FormPelicula", new NuevaPelicula());
		
		//Creamos un array de String para los generos de las peliculas. Sera para trabajar con el menu desplegable ("Select")
		
		String[] genero = new String [] {"Animación", "Aventuras", "Bélico", "Biográfica", "Ciencia ficción", "Comedia", "Drama", "Fantasía", "Musical", "Romance", "Terror", "Thriller" };
		model.addAttribute("genero", genero);
		
		
		
/* Otra posible mejor idea, hacer un FORMBEAN con el nombre EDAD y crear una coleccion con la edad y el icono con su correspondiente ruta.
 * 		
 *		Creamos un array de String para los tipos de edad. Nos servirá para trabajar con radiobuttons en la vista y recoger 
		lo que el usuario pincha
				
		String[] edad = new String [] {"+18", "-7", "-12", "-16", "+18" };
		model.addAttribute("edad", edad);
		
		
		// Creamos un array para los iconos de las imagenes que van junto al radiobuttons
		String[] iconoEdad = new String [] {"../../static/image/A.ico", "../../static/image/7.ico", "../../static/image/12.ico", "../../static/image/16.ico", "../../static/image/18.ico" };
		model.addAttribute("iconoEdad", iconoEdad);
		
*/
		
		return "/formularioPelicula";
	}
	
	@PostMapping ( "/addPelicula" )
	public String submit (@ModelAttribute("FormPelicula") Pelicula pelicula, BindingResult bindingResult, Model model ) {
		
		peliculaService.save(pelicula);
		return "redirect: /admin/index";
	}	
	
}
