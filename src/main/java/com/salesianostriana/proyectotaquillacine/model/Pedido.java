package com.salesianostriana.proyectotaquillacine.model;

import java.util.List;

import javax.persistence.Entity;


//Clase POJO normal

@Entity
public class Pedido {

	private List<LineaPedido> LineaPedido;

	
//Constructores	
	public Pedido() { }
	
	
	public Pedido(List<com.salesianostriana.proyectotaquillacine.model.LineaPedido> lineaPedido) {
		LineaPedido = lineaPedido;
	}


//Getters & Setters	

	public List<LineaPedido> getLineaPedido() {
		return LineaPedido;
	}


	public void setLineaPedido(List<LineaPedido> lineaPedido) {
		LineaPedido = lineaPedido;
	}


	@Override
	public String toString() {
		return "Pedido [LineaPedido=" + LineaPedido + "]";
	}
	
	
	
	
}
