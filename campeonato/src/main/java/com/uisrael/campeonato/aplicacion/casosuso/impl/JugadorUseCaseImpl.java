package com.uisrael.campeonato.aplicacion.casosuso.impl;

import java.util.List;

import com.uisrael.campeonato.aplicacion.casosuso.entradas.IJugadorUseCase;
import com.uisrael.campeonato.dominio.entidades.Jugador;

import com.uisrael.campeonato.dominio.repositorio.IJugadorRepositorio;

public class JugadorUseCaseImpl implements IJugadorUseCase {

	private final IJugadorRepositorio repositorio;
	
	
	public JugadorUseCaseImpl(IJugadorRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}


	@Override
	public List<Jugador> buscarJugadorNombre(String nombre, boolean estado) {
		
		return repositorio.buscarJugadorNombre(nombre, estado);
	}


	@Override
	public List<Jugador> listarTodosJugadores() {
		
		return repositorio.listarTodosJugadores();
	}


	@Override
	public List<Jugador> buscarJugadorNombre(String nombre) {
		// TODO Auto-generated method stub
		return repositorio.buscarJugadorNombre(nombre);
	}


	@Override
	public Jugador guardar(Jugador nuevoJUgador) {
		// TODO Auto-generated method stub
		return repositorio.guardar(nuevoJUgador);
	}

}
