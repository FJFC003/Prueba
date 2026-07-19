package com.uisrael.campeonato.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.campeonato.aplicacion.casosuso.entradas.IEquipoUseCase;
import com.uisrael.campeonato.dominio.entidades.Equipo;
import com.uisrael.campeonato.dominio.repositorio.IEquipoRepositorio;

public class EquipoUseCaseImpl  implements IEquipoUseCase{

	private final IEquipoRepositorio repositorio;
	
	
	public EquipoUseCaseImpl(IEquipoRepositorio repositorio) {
	
		this.repositorio = repositorio;
	}

	@Override
	public Equipo guardar(Equipo nuevaEquipo) {
		// TODO Auto-generated method stub
		return repositorio.guardar(nuevaEquipo);
	}

	@Override
	public Equipo buscarPorId(int idEquipo) {
		// TODO Auto-generated method stub
		return repositorio.buscarPorId(idEquipo)
				.orElseThrow(()-> new RuntimeException("Equipo no encontrado"));
	}

	@Override
	public List<Equipo> listarTodos() {
		// TODO Auto-generated method stub
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idEquipo) {
		repositorio.eliminar(idEquipo);
		
	}

	@Override
	public List<Equipo> findByNombres(String nombres) {
		// TODO Auto-generated method stub
		return repositorio.findByNombres(nombres);
	}

}
