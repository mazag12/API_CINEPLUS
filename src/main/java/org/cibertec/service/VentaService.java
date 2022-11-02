package org.cibertec.service;

import java.util.List;

import org.cibertec.entidad.Venta;

public interface VentaService {

	public List<Venta> ListarVenta();
	
	public void guardar (Venta venta);
	
	public void actualizar (Venta venta);
	
	public void eliminar (Integer cod);
	
	public Venta encontrarVenta(Integer cod);
	
}
