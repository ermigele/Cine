package com.salesianostriana.proyectotaquillacine.formbean;

import java.util.List;

import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.model.Sesion;

public class NuevoTicket {

	
	private Pelicula pelicula;
	private List<Sesion> sesion;
	private int[] listaButacas;
	private Sala sala;
	
	public NuevoTicket() { }
	
	public NuevoTicket(Pelicula pelicula, List<Sesion> sesion, int[] listaButacas, Sala sala) {
		this.pelicula = pelicula;
		this.sesion = sesion;
		this.listaButacas = listaButacas;
		this.sala = sala;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public List<Sesion> getSesion() {
		return sesion;
	}

	public void setSesion(List<Sesion> sesion) {
		this.sesion = sesion;
	}

	public int[] getListaButacas() {
		return listaButacas;
	}

	public void setListaButacas(int[] listaButacas) {
		this.listaButacas = listaButacas;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "NuevoTicket [pelicula=" + pelicula + ", sesion=" + sesion + ", listaButacas=" + listaButacas + ", sala="
				+ sala + "]";
	}
	
}
