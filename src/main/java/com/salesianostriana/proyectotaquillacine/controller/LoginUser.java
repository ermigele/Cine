package com.salesianostriana.proyectotaquillacine.controller;

public class LoginUser {

//ATRIBUTOS	
	
	private String usuario;
	
	private String pass;
	
	
//CONSTRUCTORES
	
	public LoginUser() { }


	public LoginUser(String usuario, String pass) {
		this.usuario = usuario;
		this.pass = pass;
	}

//GETTERS & SETTERS	

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	@Override
	public String toString() {
		return "LoginUser [usuario=" + usuario + ", pass=" + pass + "]";
	}
	
	
	
}
