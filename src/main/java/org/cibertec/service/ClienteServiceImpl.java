package org.cibertec.service;

import java.util.List;

import org.cibertec.entidad.Cliente;
import org.cibertec.repositorio.ClienteRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRespositorio clienteRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> ListarCliente() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public void actualizar(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public void eliminar(Integer cod) {
		clienteRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente encontrarCliente(Integer cod) {
		return clienteRepository.findById(cod).orElse(null);
	}

}
