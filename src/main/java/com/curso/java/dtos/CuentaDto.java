package com.curso.java.dtos;

import java.math.BigDecimal;

public class CuentaDto {

	private  String numeroCuenta;
	private  String descripcion;
	private  String tipo;
	private  BigDecimal saldo;
	
	public CuentaDto(String numeroCuenta, String descripcion, String tipo, BigDecimal saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.saldo = saldo;
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
	
	
}
