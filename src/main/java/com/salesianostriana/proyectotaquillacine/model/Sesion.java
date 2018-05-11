package com.salesianostriana.proyectotaquillacine.model;

import java.util.Date;

import javax.persistence.Entity;


//Clase POJO normal


@Entity
public class Sesion {
	
	private long idSesion;
	private Date horaSesion;
	private Pelicula pelicula;
	private Sala sala;
	
//Constructores	
	
	public Sesion() { }
	
	public Sesion(long idSesion, Date horaSesion, Pelicula pelicula, Sala sala) {
		this.idSesion = idSesion;
		this.horaSesion = horaSesion;
		this.pelicula = pelicula;
		this.sala = sala;
	}

//Getters & Setters	

	
	
	public Date getHoraSesion() {
		return horaSesion;
	}


	public long getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(long idSesion) {
		this.idSesion = idSesion;
	}

	public void setHoraSesion(Date horaSesion) {
		this.horaSesion = horaSesion;
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
		return "Sesion [idSesion=" + idSesion + ", horaSesion=" + horaSesion + ", pelicula=" + pelicula + ", sala="
				+ sala + "]";
	}
	
	
	
}
