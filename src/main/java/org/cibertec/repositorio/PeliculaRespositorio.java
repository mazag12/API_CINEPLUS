package org.cibertec.repositorio;

import org.cibertec.entidad.Pelicula;
import org.springframework.data.repository.CrudRepository;

public interface PeliculaRespositorio extends CrudRepository<Pelicula, Integer> {

}
