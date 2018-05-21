package com.salesianostriana.proyectotaquillacine.formbean;

import java.time.LocalTime;
import java.util.Date;

public class NuevaPelicula {

//ATRIBUTOS
	private String titulo; //CLASE PELICULA
	private String genero;
	private String director;
	private String edad;
	private Date estreno;
	private int duracion; // -PELICULA
	
	private String nombreSala; //CLASE SALA
	private LocalTime horaSesion; //CLASE SESION
	
	
//CONSTRUCTORES	
	
	public NuevaPelicula () { }
	
	public NuevaPelicula(String titulo, String genero, String director, String edad, Date estreno, int duracion, String nombreSala,
			LocalTime horaSesion) {
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.edad = edad;
		this.estreno = estreno;
		this.duracion = duracion;
		this.nombreSala = nombreSala;
		this.horaSesion = horaSesion;
	}

//GETTERS & SETTERS
	
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
	public String getNombreSala() {
		return nombreSala;
	}
	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}
	public LocalTime getHoraSesion() {
		return horaSesion;
	}
	public void setHoraSesion(LocalTime horaSesion) {
		this.horaSesion = horaSesion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + duracion;
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result + ((estreno == null) ? 0 : estreno.hashCode());
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((horaSesion == null) ? 0 : horaSesion.hashCode());
		result = prime * result + ((nombreSala == null) ? 0 : nombreSala.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NuevaPelicula other = (NuevaPelicula) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (duracion != other.duracion)
			return false;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (estreno == null) {
			if (other.estreno != null)
				return false;
		} else if (!estreno.equals(other.estreno))
			return false;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (horaSesion == null) {
			if (other.horaSesion != null)
				return false;
		} else if (!horaSesion.equals(other.horaSesion))
			return false;
		if (nombreSala == null) {
			if (other.nombreSala != null)
				return false;
		} else if (!nombreSala.equals(other.nombreSala))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NuevaPelicula [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", edad=" + edad
				+ ", estreno=" + estreno + ", duracion=" + duracion + ", nombreSala=" + nombreSala + ", horaSesion="
				+ horaSesion + "]";
	}

	
}
