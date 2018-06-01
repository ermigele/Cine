package com.salesianostriana.proyectotaquillacine.formbean;

import com.salesianostriana.proyectotaquillacine.model.Butaca;
import com.salesianostriana.proyectotaquillacine.model.Sesion;

public class GuardarTicket {

	private Butaca idButaca;
	private Sesion idSesion;
	private double precio;
	
	
	public GuardarTicket(Butaca idButaca, Sesion idSesion, double precio) {
		this.idButaca = idButaca;
		this.idSesion = idSesion;
		this.precio = precio;
	}

	public Butaca getIdButaca() {
		return idButaca;
	}


	public void setIdButaca(Butaca idButaca) {
		this.idButaca = idButaca;
	}


	public Sesion getIdSesion() {
		return idSesion;
	}


	public void setIdSesion(Sesion idSesion) {
		this.idSesion = idSesion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "GuardarTicket [idButaca=" + idButaca + ", idSesion=" + idSesion + ", precio=" + precio + "]";
	}
	
	
	
}
