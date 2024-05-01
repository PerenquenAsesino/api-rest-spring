package com.nestor.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.api.rest.entity.Cliente;
import com.nestor.api.rest.service.ClienteService;

@RestController
@RequestMapping("/api/")
public class ClienteController {
	
//localhost:8080/api/clientes   <----- RUTA
	
	@Autowired
	private ClienteService servicio;
	
	@GetMapping("/clientes")
	public List<Cliente> index() {
		
		return servicio.buscarTodos();
	}
	
}
