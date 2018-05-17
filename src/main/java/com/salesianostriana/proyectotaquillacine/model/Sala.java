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
	private int numSala;
	
	@OneToMany
	private List<Butaca> listaButacas;

//Constructores
	
	public Sala() { }
	

	public Sala(int numSala, List<Butaca> listaButacas) {

		this.numSala = numSala;
		this.listaButacas = listaButacas;
	}

//Getters & Setters	


	public int getNumSala() {
		return numSala;
	}


	public List<Butaca> getListaButacas() {
		return listaButacas;
	}


	public void setListaButacas(List<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}


	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	
	
	
}
