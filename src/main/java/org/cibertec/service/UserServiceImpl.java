package org.cibertec.service;

import java.util.List;

import org.cibertec.entidad.Usercine;
import org.cibertec.repositorio.UsercineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UsercineRepositorio UsuarioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usercine> ListarUsuario() {
		return (List<Usercine>) UsuarioRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Usercine usuario) {
		UsuarioRepository.save(usuario);
	}

	@Override
	@Transactional
	public void actualizar(Usercine usuario) {
		UsuarioRepository.save(usuario);
	}

	@Override
	@Transactional
	public void eliminar(Integer cod) {
		UsuarioRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Usercine encontrarUsuario(Integer cod) {
		return UsuarioRepository.findById(cod).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Usercine buscarNombre(String nombre) {
		return UsuarioRepository.findByNombre(nombre);
	}

}
