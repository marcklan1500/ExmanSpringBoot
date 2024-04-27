package com.curso.java.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.java.dtos.ClienteResponse;
import com.curso.java.models.Cliente;
import com.curso.java.models.Cuenta;
import com.curso.java.repositories.ClienteRepository;
import com.curso.java.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired ClienteRepository clienteRepository;
	@Override
	public List<Cliente> obtenerCliente(){
		return clienteRepository.findAll();
	}
	@Override
	public Cliente guardarCliente(Cliente cliente) {
		
		for(Cuenta detalle : cliente.getDetalleCuentaList()) {
			detalle.setCliente(cliente);
		}
		return clienteRepository.save(cliente);
		
	}



	
	private ClienteResponse doDto(Cliente cliente) {
		return  new ClienteResponse(cliente.getId(),cliente.getNombres() + " " + cliente.getApellidos(),cliente.getDireccion(),cliente.getTelefono(),cliente.getIdentificacion(), null);
	}

	@Override
	public Cliente findByIdentificacion(String identificacion) {
		return clienteRepository.findByIdentificacion(identificacion);
	}

	
}
