package com.curso.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.java.models.Cuenta;
import com.curso.java.services.CuentaService;
import com.curso.java.utils.WebUtil;

@RestController
@RequestMapping("/cuenta")
public class CuentaController extends BaseController{
	@Autowired
	private CuentaService cuentaService;
	
	@GetMapping()
	public ResponseEntity<?>obtener(){
	  List<Cuenta> cuentas = cuentaService.obtenerCuenta();
	  if (cuentas==null||cuentas.isEmpty()) {
		  return ResponseEntity.noContent().build();
	  }
		return ResponseEntity.ok(cuentas);
	}
	
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody @Validated Cuenta cuenta, BindingResult result) {
		if(result.hasErrors()){
			return WebUtil.getErrors(result);
		}
		Cuenta newCuenta= cuentaService.guardarCuenta(cuenta);
		if(newCuenta==null) {
			throw new DataIntegrityViolationException("Ya existe una cuenta con el  numero:" + cuenta.getNumeroCuenta());
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(newCuenta);
	}
}
