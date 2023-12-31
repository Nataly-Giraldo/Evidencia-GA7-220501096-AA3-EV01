package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // mapea la entidad
@Table(name="usuario")
public class Usuario {
	//esta parte de usuario es para la evidencia iniciar sesión GA7-220501096-AA4-EV02 = Diseño y desarrollo de servicios web-caso.
	
	@Id													//llave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementar
	@Column (name="id_usuario", nullable = false)
	private int id;
	
	@Column(name = "nom_usuario", nullable = false, length = 45)
	private String username;							
	
	@Column(name = "contraseña_usuario", nullable = false, length = 45)
	private String password;

	public Usuario() {
		super();
	}

	public Usuario(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}