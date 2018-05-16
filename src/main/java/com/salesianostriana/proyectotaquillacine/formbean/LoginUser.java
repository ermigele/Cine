package com.salesianostriana.proyectotaquillacine.formbean;

public class LoginUser {
<<<<<<< HEAD

//ATRIBUTOS
	private String user;

	private String pass;

//CONSTRUCTORES

	public LoginUser() { }

	public LoginUser(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

// GETTERS & SETTERS
	
	public String getUsuario() {
		return user;
	}

	public void setUsuario(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		LoginUser other = (LoginUser) obj;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LoginUser [user=" + user + ", pass=" + pass + "]";
	}

}
=======
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		LoginUser other = (LoginUser) obj;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LoginUser [usuario=" + usuario + ", pass=" + pass + "]";
	}

}

>>>>>>> branch 'master' of https://github.com/ermigele/Cine
