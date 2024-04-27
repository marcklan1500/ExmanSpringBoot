package com.curso.java.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.java.dtos.CuentaResponse;
import com.curso.java.models.Cuenta;
import com.curso.java.repositories.CuentaRepository;
import com.curso.java.services.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService{
	@Autowired CuentaRepository cuentaRepository;
	@Override
	public List<Cuenta> obtenerCuenta(){
		return cuentaRepository.findAll();
	}
	
	@Override
	public Cuenta guardarCuenta(Cuenta cuenta) {
		if(!cuentaRepository.findByNumeroCuenta(cuenta.getNumeroCuenta()).isPresent()) {
			return cuentaRepository.save(cuenta); 
		}
		
		return null;
	}
	
	
	private CuentaResponse doDto(Cuenta cuenta) {
		return  new CuentaResponse(cuenta.getNumeroCuenta(), cuenta.getDescripcion() , cuenta.getTipo(), cuenta.getSaldo(), cuenta.getEstado());
	}
	
}
