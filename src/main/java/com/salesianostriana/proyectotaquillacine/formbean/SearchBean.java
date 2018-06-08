package com.salesianostriana.proyectotaquillacine.formbean;

public class SearchBean {

	/**
	 * Cadena de caracteres tipo String que se le pasa lo que queremos buscar
	 * en nuestro bucle para mostrarlo en nuestra plantilla
	 */
	
	private String search;
	
	
	public SearchBean(){
		
	}
	
	public SearchBean(String search) {
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
}
