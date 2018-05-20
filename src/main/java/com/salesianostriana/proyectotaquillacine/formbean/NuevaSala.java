package com.salesianostriana.proyectotaquillacine.formbean;

public class NuevaSala {
	
//ATRIBUTOS	
	private String nombreSala;
	private int numButacaXFila;
	private int numFila;
	
//CONSTRUCTORES
	
	public NuevaSala() { }
	
	public NuevaSala(String nombreSala, int numButacaXFila, int numFila) {
		this.nombreSala = nombreSala;
		this.numButacaXFila = numButacaXFila;
		this.numFila = numFila;
	}

	
//GETTERS & SETTERS
	
	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreSala == null) ? 0 : nombreSala.hashCode());
		result = prime * result + numButacaXFila;
		result = prime * result + numFila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NuevaSala other = (NuevaSala) obj;
		if (nombreSala == null) {
			if (other.nombreSala != null)
				return false;
		} else if (!nombreSala.equals(other.nombreSala))
			return false;
		if (numButacaXFila != other.numButacaXFila)
			return false;
		if (numFila != other.numFila)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NuevaSala [nombreSala=" + nombreSala + ", numButacaXFila=" + numButacaXFila + ", numFila=" + numFila
				+ "]";
	}

	
	

	
	
	
	
}
