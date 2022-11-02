package org.cibertec.service;

import java.util.List;

import org.cibertec.entidad.Cliente;

public interface ClienteService {

	public List<Cliente> ListarCliente();
	
	public void guardar (Cliente cliente);
	
	public void actualizar (Cliente cliente);
	
	public void eliminar (Integer cod);
	
	public Cliente encontrarCliente(Integer cod);
	
}
