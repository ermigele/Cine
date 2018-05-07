package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;


//Clase POJO normal

@Entity
public class Sala {

	private int numSala;

//Constructores
	
	public Sala() { }
	
	public Sala(int numSala) {
		this.numSala = numSala;
	}

//Getters & Setters	
	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	
	
	
}
