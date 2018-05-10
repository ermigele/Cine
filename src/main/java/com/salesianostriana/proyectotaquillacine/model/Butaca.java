package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;
import javax.persistence.Id;


//Clase POJO normal

@Entity
public class Butaca {

	
	@Id
	private int numButaca;
	
	
//Constructores
	
	public Butaca () { }


	public Butaca(int numButaca) {
		this.numButaca = numButaca;
	}

//Getters & Setters	

	public int getNumButaca() {
		return numButaca;
	}


	public void setNumButaca(int numButaca) {
		this.numButaca = numButaca;
	}


	@Override
	public String toString() {
		return "Butaca [numButaca=" + numButaca + "]";
	}
	
	
	
	
}
