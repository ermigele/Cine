package com.salesianostriana.proyectotaquillacine.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//Clase POJO normal

@Entity
@Table(name="Pedido")

public class Pedido {

	@Id @GeneratedValue
	private long id;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)

	private List<LineaPedido> LineaPedido;

	
//CONSTRUCTORES
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
