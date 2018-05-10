package prueba;

public class Empleado {
	
	private String nombre;
	private Long id;
	private String email;
	
//Constructores
	
	public Empleado() { }

	public Empleado(String nombre, Long id, String email) {
		this.nombre = nombre;
		this.id = id;
		this.email = email;
	}

	
//Getters&Setters	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", id=" + id + ", email=" + email + "]";
	}
	
	
}
