package org.cibertec.controller;

import java.util.List;

import org.cibertec.entidad.Pelicula;
import org.cibertec.entidad.Tipopelicula;
import org.cibertec.service.PeliculaService;
import org.cibertec.service.TipopeliculaService;
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
@RequestMapping("/Pelicula")
public class PeliculaController {

	@Autowired
	private PeliculaService peliculaservicio;
	
	@Autowired
	private TipopeliculaService tipopeliculaservicio;
	
	@GetMapping("/lista")
	public List<Pelicula> lista() {
		return peliculaservicio.ListarPelicula();
	}	
	
	@GetMapping("/lista/{codigo}")
	public  Pelicula List(@PathVariable("codigo") Integer cod) {
		return peliculaservicio.encontrarPelicula(cod);
	}
	
	@PostMapping("/registar")
	public void registrar(@RequestBody Pelicula usuario) {
		peliculaservicio.guardar(usuario);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Pelicula usuario) {
		peliculaservicio.guardar(usuario);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		peliculaservicio.eliminar(cod);
	}
	
//	TIPO DE PELICULAS
	
	@GetMapping("/Tipo/lista")
	public List<Tipopelicula> listaTipoPelicula() {
		return tipopeliculaservicio.ListarTipopelicula();
	}	
	
	@GetMapping("/Tipo/lista/{codigo}")
	public  Tipopelicula ListTipoPelicula(@PathVariable("codigo") Integer cod) {
		return tipopeliculaservicio.encontrarTipopelicula(cod);
	}
	
	@PostMapping("/Tipo/registar")
	public void registrarTipoPelicula(@RequestBody Tipopelicula tipopelicula) {
		tipopeliculaservicio.guardar(tipopelicula);
	}
	
	@PutMapping("/Tipo/actualizar")
	public void actualizarTipoPelicula(@RequestBody Tipopelicula tipopelicula) {
		tipopeliculaservicio.guardar(tipopelicula);
	}
	
	@DeleteMapping("/Tipo/eliminar/{codigo}")
	public void eliminarTipoPelicula(@PathVariable("codigo") Integer cod) {
		tipopeliculaservicio.eliminar(cod);
	}
	
	
}
