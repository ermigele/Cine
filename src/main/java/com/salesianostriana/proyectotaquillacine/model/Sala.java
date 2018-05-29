package com.salesianostriana.proyectotaquillacine.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Clase POJO normal

@Entity
@Table(name = "Sala")

public class Sala {

	@Id
	@GeneratedValue
	private long idSala;
	private String nombreSala;

	@OneToOne
	private Cine cine;
	
	@OneToMany
	private List<Butaca> listaButacas;

	@OneToMany
	private List<Sesion> listaSesiones;
	
	// Constructores

	public Sala() {
	}

	public Sala(long idSala, String nombreSala, List<Butaca> listaButacas, List<Sesion> listaSesiones, Cine cine) {
		this.idSala = idSala;
		this.nombreSala = nombreSala;
		this.listaButacas = listaButacas;
		this.listaSesiones = listaSesiones;
		this.cine = cine;
	}


	// Getters & Setters

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



	public List<Sesion> getListaSesiones() {
		return listaSesiones;
	}

	public void setListaSesiones(List<Sesion> listaSesiones) {
		this.listaSesiones = listaSesiones;
	}

	public Cine getCine() {
		return cine;
	}

	public void setCine(Cine cine) {
		this.cine = cine;
	}

	@Override
	public String toString() {
		return "Sala [idSala=" + idSala + ", nombreSala=" + nombreSala + ", cine=" + cine + ", listaButacas="
				+ listaButacas + ", listaSesiones=" + listaSesiones + "]";
	}
	
	/*
	//metodo Helper   Añadir
	public Sala addButaca(Butaca b) {  
		if (b != null) {					//Comprueba que existe la butaca
			b.setSala(this);				// Añade la sala actual a la butaca
			this.getListaButacas().add(b);  // Añade la butaca a la sala
		}
		return this;						//Devuelve la butaca
	}

	*/
	
	/*
	//método Helper Eliminar
	public Sala removeButaca (Butaca b) {  
		if (b != null) {						//Comprueba que exista la butaca
			b.setSala(null);					// Te asigna a NULL la butaca para que no haya y permita borrarla
			this.getListaButacas().remove(b);	//elimina la butaca de la listadeButacas
		}
		return this;							//te devuelve el objeto eliminado
	}
	
	*/
}
