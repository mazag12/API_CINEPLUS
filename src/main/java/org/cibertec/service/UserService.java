package org.cibertec.service;

import java.util.List;

import org.cibertec.entidad.Usercine;

public interface UserService {

	public List<Usercine> ListarUsuario();
	
	public void guardar (Usercine usuario);
	
	public void actualizar (Usercine usuario);
	
	public void eliminar (Integer cod);
	
	public Usercine encontrarUsuario(Integer cod);
	
	public Usercine buscarNombre(String nombre);
	
}
