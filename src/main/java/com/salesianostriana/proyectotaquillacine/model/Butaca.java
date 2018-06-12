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
	private int numButacaXFila;
	private int numFila;
	
	@ManyToOne
	private Sala sala;
	
	@OneToOne
	private Entrada entrada;
	
//Constructores
	
	public Butaca () { }



	public Butaca(long idButaca, int numButacaXFila, int numFila, Sala sala, Entrada entrada) {
		this.idButaca = idButaca;
		this.numButacaXFila = numButacaXFila;
		this.numFila = numFila;
		this.sala = sala;
		this.entrada = entrada;
	}
	
	
//Getters & Setters	

	public long getIdButaca() {
		return idButaca;
	}



	public void setIdButaca(long idButaca) {
		this.idButaca = idButaca;
	}



	public int getNumButacaXFila() {
		return numButacaXFila;
	}



	public void setNumButacaXFila(int numButacaXFila) {
		this.numButacaXFila = numButacaXFila;
	}



	public int getNumFila() {
		return numFila;
	}



	public void setNumFila(int numFila) {
		this.numFila = numFila;
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


 
	@Override
	public String toString() {
		//return "Butaca [idButaca=" + idButaca + ", numButacaXFila=" + numButacaXFila + ", numFila=" + numFila
		//		+ ", sala=" + sala + "]";
		//return "Butaca [numero=" + numButacaXFila + " en fila=" + numFila+"]";
		return "Fila "+numFila+"_Numero "+numButacaXFila;
	}
	
}
