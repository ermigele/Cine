package com.salesianostriana.proyectotaquillacine.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//Clase POJO normal


@Entity
@Table(name="Pelicula")

public class Pelicula {
	
	@Id
	@GeneratedValue
	private long idPelicula;
	private String titulo;
	private String genero;
	private String director;
	private Date estreno;
	private int duracion;
	
	@ManyToOne
	private Sala sala;
	
	@OneToMany
	private Set<Sesion> sesion;
	
//Contructores	
	
	public Pelicula () { }
	
	public Pelicula(long idPelicula, String titulo, String genero, String director, Date estreno, int duracion,
			Sala sala, Set<Sesion> sesion) {
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.estreno = estreno;
		this.duracion = duracion;
		this.sala = sala;
		this.sesion = sesion;
	}
	
//Getters & Setters	



	public long getIdPelicula() {
		return idPelicula;
	}


	public void setIdPelicula(long idPelicula) {
		this.idPelicula = idPelicula;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public Date getEstreno() {
		return estreno;
	}


	public void setEstreno(Date estreno) {
		this.estreno = estreno;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + ", titulo=" + titulo + ", genero=" + genero + ", director="
				+ director + ", estreno=" + estreno + ", duracion=" + duracion + "]";
	}
	
	
	

}
