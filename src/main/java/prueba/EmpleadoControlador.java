package prueba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoControlador {

	/* Vamos a tener dos controladores, uno para VER (petición tipo Get) 
	 *  GESTIONAR (peticion tipo Post) los datos del formulario
	 *  
	 *  Este primer método solo muestra el formulario y es igual a los que
	 *  otras ocaciones
	 *  
	 *  un Model al que añadimos una instancia de nuestra clase modelo tipo
	 *  sin ningún valor por eso esta vacio, peticion tipo Get */
	
	
	@GetMapping ("/empleado")
	public String showForm(Model model) {
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		
		return "form";	
	}
	
	
	
	@PostMapping ("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm")Empleado empleado, Model model ){
		
		model.addAttribute("empleado", empleado);
		
		return "view";
		
	}
	
	
	
	
}
