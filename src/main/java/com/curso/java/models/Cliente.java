package com.curso.java.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private  String nombres;
	
	private  String apellidos;
	
	private  String direccion;
	
	private  String telefono;
	
	private String identificacion;
	
	@OneToMany (mappedBy = "cliente", cascade=CascadeType.ALL)
	private  List<Cuenta> detalleCuentaList;
	
	public Cliente() {
		
	}
	

	public List<Cuenta> getDetalleCuentaList() {
		return detalleCuentaList;
	}

	public void setDetalleCuentaList(List<Cuenta> detalleCuentaList) {
		this.detalleCuentaList = detalleCuentaList;
	}

	public Cliente(long id, String nombres, String apellidos, String direccion, String telefono, String identificacion,
			Cuenta cuenta) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
