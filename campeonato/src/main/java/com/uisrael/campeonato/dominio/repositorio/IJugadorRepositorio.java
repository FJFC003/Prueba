package com.uisrael.campeonato.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.campeonato.dominio.entidades.Jugador;
import com.uisrael.campeonato.infraestructura.persistencia.jpa.JugadorEntity;

public interface IJugadorRepositorio {

	Jugador guardar(Jugador nuevaJugador);

	Optional<Jugador> buscarPorId(int idJugador);

	List<Jugador> listarTodos();

	void eliminar(int idJugador);

	List<Jugador> buscarJugadorNombre(String nombre, boolean estado);
	
	List<Jugador> listarTodosJugadores();
	
	List<Jugador> buscarJugadorNombre(String nombre);
}
