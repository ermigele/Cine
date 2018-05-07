package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;

//Clase POJO normal


@Entity
public class Entrada {
	@Id
	@GenerateValues
	
	
	private long numEntrada;
	private Pelicula pelicula;
	private Sala sala;
	private Sesion sesion;
	private Butaca butaca;
	private double precio;
	
//constructores
	
	public Entrada() { }
	
	public Entrada(long numEntrada, Pelicula pelicula, Sala sala, Sesion sesion, Butaca butaca, double precio) {
		this.numEntrada = numEntrada;
		this.pelicula = pelicula;
		this.sala = sala;
		this.sesion = sesion;
		this.butaca = butaca;
		this.precio = precio;
	}

	
//Getters & Setters
	
	public long getNumEntrada() {
		return numEntrada;
	}


	public void setNumEntrada(long numEntrada) {
		this.numEntrada = numEntrada;
	}


	public Pelicula getPelicula() {
		return pelicula;
	}


	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}


	public Sala getSala() {
		return sala;
	}


	public void setSala(Sala sala) {
		this.sala = sala;
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

	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Entrada [numEntrada=" + numEntrada + ", pelicula=" + pelicula + ", sala=" + sala + ", sesion=" + sesion
				+ ", butaca=" + butaca + ", precio=" + precio + "]";
	}
	
	
}
