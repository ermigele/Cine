package com.salesianostriana.proyectotaquillacine.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


//Clase POJO normal

@Entity
@Table(name="Pedido")

public class Pedido {
	@Id
	@GeneratedValue

	@Id @GeneratedValue
	private long id;
	
<<<<<<< HEAD
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
=======
	@OneToMany(
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
>>>>>>> branch 'master' of https://github.com/ermigele/Cine
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
