package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Clase POJO normal

@Entity
@Table(name="LineaPedido")

public class LineaPedido {
	@Id @GeneratedValue

	private long id;
	private int cantidad;
	
	@OneToOne
	private Entrada entrada;
	
	
//Constructores	
	
	public LineaPedido() { }
	
	public LineaPedido(long id, int cantidad, Entrada entrada) {
		this.id = id;
		this.cantidad = cantidad;
		this.entrada = entrada;
	}


//Getters & Setters

	
	
	public int getCantidad() {
		return cantidad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Entrada getEntrada() {
		return entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	@Override
	public String toString() {
		return "LineaPedido [id=" + id + ", cantidad=" + cantidad + ", entrada=" + entrada + "]";
	}
	
	
	
}
