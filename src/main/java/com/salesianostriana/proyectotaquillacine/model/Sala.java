package com.salesianostriana.proyectotaquillacine.model;

import java.util.List;

import javax.persistence.Entity;


//Clase POJO normal

@Entity
public class Sala {

	
	private long idSala;
	private int numSala;
	private List<Butaca> listaButacas;

//Constructores
	
	public Sala() { }
	

	public Sala(long idSala, int numSala, List<Butaca> listaButacas) {
		this.idSala = idSala;
		this.numSala = numSala;
		this.listaButacas = listaButacas;
	}

	//Getters & Setters	




	public int getNumSala() {
		return numSala;
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


	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	
	
	
}
