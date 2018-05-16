package com.salesianostriana.proyectotaquillacine.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToOne;
=======
>>>>>>> branch 'master' of https://github.com/ermigele/Cine
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Clase POJO normal


@Entity
@Table(name="Entrada")

public class Entrada {
<<<<<<< HEAD
	@Id @GeneratedValue
	private long id;
	
	@ManyToOne
=======
	@Id
	@GeneratedValue
	private long numEntrada;
	private Pelicula pelicula;
	private Sala sala;
>>>>>>> branch 'master' of https://github.com/ermigele/Cine
	private Sesion sesion;
	
	@OneToOne
	private Butaca butaca;
	private double precio;
	@OneToOne
	private LineaPedido lineaPedido;
	
	@OneToOne
	private LineaPedido lineaPedido;
	
//constructores
	
	public Entrada() { }
	
	public Entrada(Sesion sesion, Butaca butaca, double precio) {

		this.sesion = sesion;
		this.butaca = butaca;
		this.precio = precio;
	}

	
//Getters & Setters
	

	public Sesion getSesion() {
		return sesion;
	}


	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}


	public Butaca getButaca() {
		return butaca;
	}


	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}

	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Entrada [sesion=" + sesion
				+ ", butaca=" + butaca + ", precio=" + precio + "]";
	}
	
	
}
