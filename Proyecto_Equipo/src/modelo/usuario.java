package modelo;

public class usuario {
	private String Usuario;
	private String roll;
	private String password;
	
	public usuario(String usuario, String roll, String password) {
		Usuario = usuario;
		this.roll = roll;
		this.password = password;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
