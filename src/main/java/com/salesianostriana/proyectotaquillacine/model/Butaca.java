package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


//Clase POJO normal

@Entity
public class Butaca {

	
	@Id @GeneratedValue
	
	private long idButaca;
	private int numButaca;
	private int fila;
	
//Constructores
	
	public Butaca () { }


	public Butaca(long idButaca, int numButaca, int fila) {
		this.idButaca = idButaca;
		this.numButaca = numButaca;
		this.fila = fila;
	}

//Getters & Setters	



	public int getNumButaca() {
		return numButaca;
	}


	public long getId() {
		return idButaca;
	}


	public void setId(long id) {
		this.idButaca = id;
	}


	public void setNumButaca(int numButaca) {
		this.numButaca = numButaca;
	}


	public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	@Override
	public String toString() {
		return "Butaca [id=" + idButaca + ", numButaca=" + numButaca + ", fila=" + fila + "]";
	}
	
	
	
}
