package com.salesianostriana.proyectotaquillacine.formbean;

import java.util.Date;
import java.util.List;

import com.salesianostriana.proyectotaquillacine.model.Sala;


public class NuevaPelicula {

//ATRIBUTOS
	private String titulo; //CLASE PELICULA
	private String director;
	private String genero;
	private String edad;
	private Date estreno;
	private int duracion;
	private String enlace;
	private String descripcion;
	private boolean disponible;// -PELICULA
	
	private Sala nuevaSala; //CLASE SALA
	
	
	private List<String> sesiones; //CLASE SESION
	
	
	
//CONSTRUCTORES	
	
	

	public NuevaPelicula () { }
	
	public NuevaPelicula(String titulo, String director, String genero, String edad, Date estreno, int duracion,
			String enlace, String descripcion, boolean disponible, Sala nuevaSala, List<String> sesiones) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.edad = edad;
		this.estreno = estreno;
		this.duracion = duracion;
		this.enlace = enlace;
		this.descripcion = descripcion;
		this.disponible = disponible;
		this.nuevaSala = nuevaSala;
		this.sesiones = sesiones;
	}


//GETTERS & SETTERS
	

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
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


	public String getEnlace() {
		return enlace;
	}


	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public Sala getNuevaSala() {
		return nuevaSala;
	}

	public void setNuevaSala(Sala nuevaSala) {
		this.nuevaSala = nuevaSala;
	}

	public List<String> getSesiones() {
		return sesiones;
	}

	public void setSesiones(List<String> sesiones) {
		this.sesiones = sesiones;
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "NuevaPelicula [titulo=" + titulo + ", director=" + director + ", genero=" + genero + ", edad=" + edad
				+ ", estreno=" + estreno + ", duracion=" + duracion + ", enlace=" + enlace + ", descripcion="
				+ descripcion + ", disponible=" + disponible + ", nuevaSala=" + nuevaSala + ", sesiones=" + sesiones
				+ "]";
	}

	
}
