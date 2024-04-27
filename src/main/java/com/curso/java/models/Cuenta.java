package com.curso.java.models;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cuenta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private  String numeroCuenta;
	
	private  String descripcion;
	
	private  String tipo;
	
	private  BigDecimal saldo;
	
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	@JsonIgnore
	private Cliente cliente;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cuenta() {
		
	}
	
	public Cuenta(long id, String numeroCuenta, String descripcion, String tipo, BigDecimal saldo, String estado) {
		super();
		this.id = id;
		this.numeroCuenta = numeroCuenta;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.saldo = saldo;
		this.estado = estado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
