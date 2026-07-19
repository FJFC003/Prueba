package com.uisrael.campeonato.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.campeonato.aplicacion.casosuso.entradas.ICategoriaUseCase;
import com.uisrael.campeonato.dominio.entidades.Categoria;
import com.uisrael.campeonato.dominio.repositorio.ICategoriaRepositorio;

public class CategoriaUseCaseImpl implements ICategoriaUseCase {

	private final ICategoriaRepositorio repositorio;
	
	public CategoriaUseCaseImpl(ICategoriaRepositorio repositorio) {
		
		this.repositorio = repositorio;
	}

	@Override
	public Categoria guardar(Categoria nuevaCategoria) {
		return repositorio.guardar(nuevaCategoria);
	}

	@Override
	public Categoria buscarPorId(int idCategoria) {
		
		return repositorio.buscarPorId(idCategoria)
				.orElseThrow(() -> new RuntimeException("No se encontrol categoria"));
	}

	@Override
	public List<Categoria> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idCategoria) {
		repositorio.eliminar(idCategoria);
		
	}

}
