package com.salesianostriana.proyectotaquillacine.formbean;

import java.util.List;

import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.model.Sesion;

public class NuevoTicket {

	private long idSesion;
	private Pelicula Pelicula;
	private Sesion sesion;
	private Sala sala;
	private List<Butaca> listaButacas;
	private Butaca butacaLlena;
	private double precio;
	
	public NuevoTicket() { }


	public NuevoTicket(com.salesianostriana.proyectotaquillacine.model.Pelicula pelicula, Sesion sesion, Sala sala,
			List<Butaca> listaButacas, Butaca butacaLlena, double precio) {
		Pelicula = pelicula;
		this.sesion = sesion;
		this.sala = sala;
		this.listaButacas = listaButacas;
		this.butacaLlena = butacaLlena;
		this.precio = precio;
	}

	public Pelicula getPelicula() {
		return Pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		Pelicula = pelicula;
	}

	public Sesion getSesion() {
		return sesion;
	}

	public long getIdSesion() {
		return idSesion;
	}


	public void setIdSesion(long idSesion) {
		this.idSesion = idSesion;
	}
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public List<Butaca> getListaButacas() {
		return listaButacas;
	}

	public Butaca getButacaLlena() {
		return butacaLlena;
	}


	public void setButacaLlena(Butaca butacaLlena) {
		this.butacaLlena = butacaLlena;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void setListaButacas(List<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}

	@Override
	public String toString() {
		return "NuevoTicket [Pelicula=" + Pelicula + ", sesion=" + sesion + ", sala=" + sala + ", listaButacas="
				+ listaButacas + ", butacaLlena=" + butacaLlena + "]";
	}

}
	