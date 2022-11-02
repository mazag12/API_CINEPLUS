package org.cibertec.service;

import java.util.List;

import org.cibertec.entidad.Venta;
import org.cibertec.repositorio.VentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VentaServiceImpl implements VentaService{

	@Autowired
	private VentaRepositorio VentaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Venta> ListarVenta() {
		return (List<Venta>) VentaRepository.findAll();
	}

	@Override
	@Transactional
	public void guardar(Venta venta) {
		VentaRepository.save(venta);
	}

	@Override
	@Transactional
	public void actualizar(Venta venta) {
		VentaRepository.save(venta);
	}

	@Override
	@Transactional
	public void eliminar(Integer cod) {
		VentaRepository.deleteById(cod);
	}

	@Override
	@Transactional(readOnly = true)
	public Venta encontrarVenta(Integer cod) {
		return VentaRepository.findById(cod).orElse(null);
	}

}
