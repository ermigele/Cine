package com.salesianostriana.proyectotaquillacine.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


//Clase POJO normal

@Entity
@Table(name="Pedido")

public class Pedido {

	private long id;
	private List<LineaPedido> LineaPedido;

	
//Constructores	
	public Pedido() { }
	
	
	public Pedido(long id, List<com.salesianostriana.proyectotaquillacine.model.LineaPedido> lineaPedido) {
		this.id = id;
		LineaPedido = lineaPedido;
	}


//Getters & Setters	

	
	
	
	public List<LineaPedido> getLineaPedido() {
		return LineaPedido;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setLineaPedido(List<LineaPedido> lineaPedido) {
		LineaPedido = lineaPedido;
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", LineaPedido=" + LineaPedido + "]";
	}
	
	
	
	
}
