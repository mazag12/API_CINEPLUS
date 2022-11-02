package org.cibertec.controller;

import java.util.List;

import org.cibertec.entidad.Usercine;
import org.cibertec.service.UserService;
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
@RequestMapping("/Usuario")
public class UserController {

	@Autowired
	private UserService usuarioservicio;
	
	@GetMapping("/lista")
	public List<Usercine> lista() {
		return usuarioservicio.ListarUsuario();
	}	
	
	@GetMapping("/lista/{codigo}")
	public  Usercine List(@PathVariable("codigo") Integer cod) {
		return usuarioservicio.encontrarUsuario(cod);
	}
	
	@PostMapping("/registar")
	public void registrar(@RequestBody Usercine usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usercine usuario) {
		usuarioservicio.guardar(usuario);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		usuarioservicio.eliminar(cod);
	}
	
	@GetMapping("/buscar/{nombre}")
	public Usercine buscar(@PathVariable("nombre") String nombre) {
		return usuarioservicio.buscarNombre(nombre);
	}
	
}
