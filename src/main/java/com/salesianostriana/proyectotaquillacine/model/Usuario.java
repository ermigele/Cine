package com.salesianostriana.proyectotaquillacine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {

//ATRIBUTOS	
	
	@Id
	@GeneratedValue
	private Long id;
		
	private String username;
		
	private String pass;
		
//CONSTRUCTORES	
	
	public Usuario() { }

	public Usuario(String username, String pass) {
		this.username = username;
		this.pass = pass;
	}

//GETTERS & SETTERS	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
}
