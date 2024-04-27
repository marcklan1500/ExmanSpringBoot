package com.curso.java.services;

import java.util.List;

import com.curso.java.models.Cliente;

public interface ClienteService {
	List<Cliente> obtenerCliente();
	
	Cliente guardarCliente(Cliente cliente);
	
	Cliente findByIdentificacion(String identificacion);
	
	
}
