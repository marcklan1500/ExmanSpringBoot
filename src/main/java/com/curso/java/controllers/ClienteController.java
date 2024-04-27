package com.curso.java.controllers;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

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

import com.curso.java.models.Cliente;
import com.curso.java.services.ClienteService;
import com.curso.java.utils.WebUtil;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends BaseController{
	@Autowired
	private ClienteService clienteService;
	@GetMapping()
	public ResponseEntity<?> findByIdentificacion(@RequestBody Cliente cliente) throws NoSuchAlgorithmException{
		Cliente clienteResult =clienteService.findByIdentificacion(cliente.getIdentificacion());
		if(clienteResult ==null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No se encuentra el cliente");
		}else {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hashedBytes = digest.digest(clienteResult.getIdentificacion().getBytes());
	        String hashedId = Base64.getEncoder().encodeToString(hashedBytes);
	        
	        clienteResult.setIdentificacion(hashedId);
	        
	        
	        
	        return ResponseEntity.ok(clienteResult);
		}				
	}
	
	@PostMapping
	public ResponseEntity<?> guardar(@RequestBody @Validated Cliente cliente, BindingResult result) {
		if(result.hasErrors()){
			return WebUtil.getErrors(result);
		}
		Cliente newCliente= clienteService.guardarCliente(cliente);
		if(newCliente==null) {
			throw new DataIntegrityViolationException("Ya existe un cliente con la identificacion:" + cliente.getIdentificacion());
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(newCliente);
	}


}
