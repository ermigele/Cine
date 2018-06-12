package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Clase POJO normal

@Entity
@Table(name="LineaPedido")

public class LineaPedido {
	@Id @GeneratedValue

	private long id;
	private int cantidad;
	private double precioUnitario;
	
	@OneToOne
	private Entrada entrada;
	
	@ManyToOne
	private Pedido pedido;
	
	
//Constructores	
	
	public LineaPedido() { }
	

	
	public LineaPedido(int cantidad, double precioUnitario, Entrada entrada, Pedido pedido) {
		super();
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.entrada = entrada;
		this.pedido = pedido;
	}



	//Getters & Setters


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public double getPrecioUnitario() {
		return precioUnitario;
	}



	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}



	public Entrada getEntrada() {
		return entrada;
	}



	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}



	public Pedido getPedido() {
		return pedido;
	}



	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}



	@Override
	public String toString() {
		return "LineaPedido [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", entrada="
				+ entrada + ", pedido=" + pedido + "]";
	}


	
}
