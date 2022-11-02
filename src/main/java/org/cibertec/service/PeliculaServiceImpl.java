package org.cibertec.service;

import java.util.List;

import org.cibertec.entidad.Pelicula;
import org.cibertec.repositorio.PeliculaRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeliculaServiceImpl implements PeliculaService{

	@Autowired
	private PeliculaRespositorio peliculaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Pelicula> ListarPelicula() {
		return (List<Pelicula>) peliculaRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
	}

	@Override
	@Transactional
	public void actualizar(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
	}

	@Override
	@Transactional
	public void eliminar(Integer cod) {
		peliculaRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Pelicula encontrarPelicula(Integer cod) {
		return peliculaRepository.findById(cod).orElse(null);
	}

	
	
}
