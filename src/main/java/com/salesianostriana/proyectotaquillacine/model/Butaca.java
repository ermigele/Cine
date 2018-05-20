package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


//Clase POJO normal

@Entity
@Table(name="Butaca")
public class Butaca {

	
	@Id @GeneratedValue

	private long idButaca;
	private int numButaca;
	private int fila;
	
	@ManyToOne
	private Sala sala;
	
	@OneToOne
	private Entrada entrada;
	
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


	public long getIdButaca() {
		return idButaca;
	}


	public void setIdButaca(long idButaca) {
		this.idButaca = idButaca;
	}


	public Sala getSala() {
		return sala;
	}


	public void setSala(Sala sala) {
		this.sala = sala;
	}


	public Entrada getEntrada() {
		return entrada;
	}


	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	@Override
	public String toString() {
		return "Butaca [idButaca=" + idButaca + ", numButaca=" + numButaca + ", fila=" + fila + ", sala=" + sala
				+ ", entrada=" + entrada + "]";
	}
	
	
	
}
