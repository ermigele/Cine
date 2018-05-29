package com.salesianostriana.proyectotaquillacine.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cine")
public class Cine {
//ATRIBUTOS
	
	@Id @GeneratedValue
	Long id;
	String nombre;
	@OneToMany
	private List<Sala> listaSalas;

//CONSTRUCTORES	
	
	public Cine() { }
	
	public Cine(List<Sala> listaSalas) {
		this.listaSalas = listaSalas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Sala> getListaSalas() {
		return listaSalas;
	}

	public void setListaSalas(List<Sala> listaSalas) {
		this.listaSalas = listaSalas;
	}

	@Override
	public String toString() {
		return "Cine [id=" + id + ", nombre=" + nombre + ", listaSalas=" + listaSalas + "]";
	}
	
	
	
}
