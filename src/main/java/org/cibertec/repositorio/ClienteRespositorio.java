package org.cibertec.repositorio;

import org.cibertec.entidad.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRespositorio  extends CrudRepository<Cliente, Integer> {

}
