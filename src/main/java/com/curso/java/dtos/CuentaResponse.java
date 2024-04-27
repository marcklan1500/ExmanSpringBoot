package com.curso.java.dtos;

import java.math.BigDecimal;

public class CuentaResponse {
	
	
	private  String numeroCuenta;
	private  String descripcion;
	private  String tipo;
	private  BigDecimal saldo;
	private String estado;
	
	public CuentaResponse(String numeroCuenta, String descripcion, String tipo, BigDecimal saldo, String estado) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.saldo = saldo;
		this.estado = estado;
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
