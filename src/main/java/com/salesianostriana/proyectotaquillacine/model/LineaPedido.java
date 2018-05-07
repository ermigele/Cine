package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;

//Clase POJO normal

@Entity
public class LineaPedido {
	
	
	private int cantidad;
	private Entrada entrada;
	
	
//Constructores	
	
	public LineaPedido() { }
	
	public LineaPedido(int cantidad, Entrada entrada) {
		this.cantidad = cantidad;
		this.entrada = entrada;
	}


//Getters & Setters

	public int getCantidad() {
		return cantidad;
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
		return "LineaPedido [cantidad=" + cantidad + ", entrada=" + entrada + "]";
	}
	
	
	
}
