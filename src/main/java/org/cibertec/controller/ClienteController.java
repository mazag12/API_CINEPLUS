package org.cibertec.controller;

import java.util.List;

import org.cibertec.entidad.Cliente;
import org.cibertec.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cliente")
public class ClienteController{

	@Autowired
	private ClienteService clienteservicio;
	
	@GetMapping("/lista")
	public List<Cliente> lista() {
		return clienteservicio.ListarCliente();
	}	
	
	@GetMapping("/lista/{codigo}")
	public  Cliente List(@PathVariable("codigo") Integer cod) {
		return clienteservicio. encontrarCliente(cod);
	}
	
	@PostMapping("/registar")
	public void registrar(@RequestBody Cliente usuario) {
		clienteservicio.guardar(usuario);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Cliente usuario) {
		clienteservicio.guardar(usuario);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		clienteservicio.eliminar(cod);
	}
		
}
