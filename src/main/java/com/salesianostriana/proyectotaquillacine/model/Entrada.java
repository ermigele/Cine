package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Clase POJO normal


@Entity
@Table(name="Entrada")

public class Entrada {

	@Id @GeneratedValue
	private long id;
	
	@ManyToOne
	private Sesion sesion;
	
	@OneToOne
	private Butaca butaca;
	
	@OneToOne
	private LineaPedido lineaPedido;
	
//constructores
	
	public Entrada() { }
	
	public Entrada(Sesion sesion, Butaca butaca, LineaPedido lineaPedido) {

		this.sesion = sesion;
		this.butaca = butaca;
		this.lineaPedido = lineaPedido;
	}

	
//Getters & Setters
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public LineaPedido getLineaPedido() {
		return lineaPedido;
	}

	public void setLineaPedido(LineaPedido lineaPedido) {
		this.lineaPedido = lineaPedido;
	}

	@Override
	public String toString() {
		return "Entrada [id=" + id + ", sesion=" + sesion + ", butaca=" + butaca + ", lineaPedido=" + lineaPedido + "]";
	}
	
	
}
