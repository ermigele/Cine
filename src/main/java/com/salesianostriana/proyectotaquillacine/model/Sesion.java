package com.salesianostriana.proyectotaquillacine.model;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//Clase POJO normal


@Entity
@Table(name="Sesion")

public class Sesion {
	@Id @GeneratedValue
	private LocalTime horaSesion;
	private Date fecha;
	
	@ManyToOne
	private Pelicula pelicula;
	
	@ManyToOne
	private Sala sala;
	
//Constructores	
	
	public Sesion() { }
	

	public Sesion(LocalTime horaSesion, Date fecha, Pelicula pelicula, Sala sala) {
		this.horaSesion = horaSesion;
		this.fecha = fecha;
		this.pelicula = pelicula;
		this.sala = sala;
	}


//Getters & Setters	


	public LocalTime getHoraSesion() {
		return horaSesion;
	}


	public void setHoraSesion(LocalTime horaSesion) {
		this.horaSesion = horaSesion;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	

	@Override
	public String toString() {
		return "Sesion [horaSesion=" + horaSesion + ", fecha=" + fecha + ", pelicula="
				+ pelicula + ", sala=" + sala + "]";
	}

	
}
