package com.salesianostriana.proyectotaquillacine.model;

import java.util.Date;

import javax.persistence.Entity;


//Clase POJO normal


@Entity
public class Pelicula {
	
	@Id
	@GenerateValues
	
	private int idPelicula;
	private String titulo;
	private String genero;
	private String director;
	private Date estreno;
	private int duracion;
	
//Contructores	
	
	public Pelicula () { }
	
	public Pelicula(int idPelicula, String titulo, String genero, String director, Date estreno, int duracion) {
		this.idPelicula = idPelicula;
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.estreno = estreno;
		this.duracion = duracion;
	}

	
//Getters & Setters	

	public int getIdPelicula() {
		return idPelicula;
	}


	public void setIdPelicula(int idPelicula) {
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
