package com.salesianostriana.proyectotaquillacine.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//Clase POJO normal

@Entity
@Table(name="Sala")

public class Sala {

	@Id @GeneratedValue
	private long idSala;
	private String nombreSala;
	
	@OneToMany
	private List<Butaca> listaButacas;

//Constructores
	
	public Sala() { }
	

	public Sala(String nombreSala, List<Butaca> listaButacas) {

		this.nombreSala = nombreSala;
		this.listaButacas = listaButacas;
	}

//Getters & Setters	


	public String getNombreSala() {
		return nombreSala;
	}

	
	public long getIdSala() {
		return idSala;
	}


	public void setIdSala(long idSala) {
		this.idSala = idSala;
	}


	public List<Butaca> getListaButacas() {
		return listaButacas;
	}


	public void setListaButacas(List<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}


	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}
	
	
	
}
