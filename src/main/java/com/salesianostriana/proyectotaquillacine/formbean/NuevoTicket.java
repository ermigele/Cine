package com.salesianostriana.proyectotaquillacine.formbean;

import java.util.List;

import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.model.LineaPedido;
import com.salesianostriana.proyectotaquillacine.model.Pelicula;
import com.salesianostriana.proyectotaquillacine.model.Sala;
import com.salesianostriana.proyectotaquillacine.model.Sesion;

public class NuevoTicket {

	private Pelicula Pelicula;
	private Sesion sesion;
	private Sala sala;
	private List<Butaca> listaButacas;
	private LineaPedido lineaPedido;
	
	public NuevoTicket() { }

	public NuevoTicket(com.salesianostriana.proyectotaquillacine.model.Pelicula pelicula, Sesion sesion, Sala sala,
			List<Butaca> listaButacas, LineaPedido lineaPedido) {
		Pelicula = pelicula;
		this.sesion = sesion;
		this.sala = sala;
		this.listaButacas = listaButacas;
		this.lineaPedido = lineaPedido;
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

	public void setListaButacas(List<Butaca> listaButacas) {
		this.listaButacas = listaButacas;
	}

	public LineaPedido getLineaPedido() {
		return lineaPedido;
	}

	public void setLineaPedido(LineaPedido lineaPedido) {
		this.lineaPedido = lineaPedido;
	}

	@Override
	public String toString() {
		return "NuevoTicket [Pelicula=" + Pelicula + ", sesion=" + sesion + ", sala=" + sala + ", listaButacas="
				+ listaButacas + ", lineaPedido=" + lineaPedido + "]";
	}

}
	