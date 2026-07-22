package com.uisrael.campeonato.aplicacion.casosuso.entradas;

import java.util.List;


import com.uisrael.campeonato.dominio.entidades.Jugador;

public interface IJugadorUseCase {

	List<Jugador> buscarJugadorNombre(String nombre, boolean estado);

	List<Jugador> listarTodosJugadores();

	List<Jugador> buscarJugadorNombre(String nombre);
	
	Jugador guardar(Jugador nuevoJUgador);
	
	Jugador findById(int id);
}
