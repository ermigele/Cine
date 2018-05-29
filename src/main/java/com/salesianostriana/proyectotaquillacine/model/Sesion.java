package com.salesianostriana.proyectotaquillacine.model;

import java.time.LocalTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//Clase POJO normal


@Entity
@Table(name="Sesion")

public class Sesion {
	@Id @GeneratedValue
	
	private long idSesion;
	private LocalTime horaSesion;
	private Date fecha;
	
	@ManyToOne
	private Pelicula pelicula;
	
	
//Constructores	
	
	public Sesion() { }
	
	public Sesion(long idSesion, LocalTime horaSesion, Date fecha, Pelicula pelicula) {
		this.idSesion = idSesion;
		this.horaSesion = horaSesion;
		this.fecha = fecha;
		this.pelicula = pelicula;
	}

//Getters & Setters	


	public LocalTime getHoraSesion() {
		return horaSesion;
	}


	public long getIdSesion() {
		return idSesion;
	}

	public void setIdSesion(long idSesion) {
		this.idSesion = idSesion;
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


	

	@Override
	public String toString() {
		return "Sesion [idSesion=" + idSesion + ", horaSesion=" + horaSesion + ", fecha=" + fecha + ", pelicula="
				+ pelicula + "]";
	}

	
}
