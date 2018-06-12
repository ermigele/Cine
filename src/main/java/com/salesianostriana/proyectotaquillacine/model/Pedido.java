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
	private double total;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<LineaPedido> LineaPedido;

	
//CONSTRUCTORES
	public Pedido() { }
	
	public Pedido(double total,
			List<com.salesianostriana.proyectotaquillacine.model.LineaPedido> lineaPedido) {
		this.total = total;
		LineaPedido = lineaPedido;
	}


//Getters & Setters	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<LineaPedido> getLineaPedido() {
		return LineaPedido;
	}

	public void setLineaPedido(List<LineaPedido> lineaPedido) {
		LineaPedido = lineaPedido;
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", total=" + total + ", LineaPedido=" + LineaPedido + "]";
	}

	
}
