package com.curso.java.dtos;

public class ClienteResponse {

	private long id;

	private String nombres;

	private String direccion;

	private String telefono;

	private String identificacion;
	

	public ClienteResponse(long id, String nombres, String apellidos, String direccion, String telefono,
			String identificacion) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.direccion = direccion;
		this.telefono = telefono;
		this.identificacion = identificacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	
	

}
