package org.cibertec.repositorio;

import org.cibertec.entidad.Usercine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsercineRepositorio extends JpaRepository<Usercine, Integer>{

	Usercine findByNombre(String nombre);
	
}
