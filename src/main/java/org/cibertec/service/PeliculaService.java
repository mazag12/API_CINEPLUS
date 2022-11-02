package org.cibertec.service;

import java.util.List;

import org.cibertec.entidad.Pelicula;

public interface PeliculaService {

	public List<Pelicula> ListarPelicula();
	
	public void guardar (Pelicula pelicula);
	
	public void actualizar (Pelicula pelicula);
	
	public void eliminar (Integer cod);
	
	public Pelicula encontrarPelicula(Integer cod);
	
}
