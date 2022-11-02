package org.cibertec.controller;

import java.util.List;

import org.cibertec.entidad.Venta;
import org.cibertec.service.VentaService;
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
@RequestMapping("/Venta")
public class VentaController {

	@Autowired
	private VentaService ventaservicio;
	
	@GetMapping("/lista")
	public List<Venta> lista() {
		return ventaservicio.ListarVenta();
	}	
	
	@GetMapping("/lista/{codigo}")
	public  Venta List(@PathVariable("codigo") Integer cod) {
		return ventaservicio.encontrarVenta(cod);
	}
	
	@PostMapping("/registar")
	public void registrar(@RequestBody Venta venta) {
		ventaservicio.guardar(venta);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Venta venta) {
		ventaservicio.guardar(venta);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		ventaservicio.eliminar(cod);
	}
		
}
