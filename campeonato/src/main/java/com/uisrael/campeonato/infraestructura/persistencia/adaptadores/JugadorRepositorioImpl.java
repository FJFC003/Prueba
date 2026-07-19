package com.uisrael.campeonato.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.campeonato.dominio.entidades.Jugador;
import com.uisrael.campeonato.dominio.repositorio.IJugadorRepositorio;
import com.uisrael.campeonato.infraestructura.persistencia.jpa.JugadorEntity;
import com.uisrael.campeonato.infraestructura.persistencia.mapeadores.IJugadorJpaMapper;
import com.uisrael.campeonato.infraestructura.repositorio.IJugadorJpaRepositorio;

public class JugadorRepositorioImpl implements IJugadorRepositorio {

	private final IJugadorJpaRepositorio jpaRepositorio;
	private final IJugadorJpaMapper entityMapper;

	public JugadorRepositorioImpl(IJugadorJpaRepositorio jpaRepositorio, IJugadorJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Jugador guardar(Jugador nuevaJugador) {
		JugadorEntity entity = entityMapper.toEntity(nuevaJugador);
		JugadorEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Jugador> buscarPorId(int idJugador) {
		return Optional.empty();
	}

	@Override
	public List<Jugador> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int idJugador) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Jugador> buscarJugadorNombre(String nombre, boolean estado) {
		// TODO Auto-generated method stub
		return jpaRepositorio.buscarJugadorNombre(nombre, estado)
				.stream().map(entityMapper:: toDomain).toList();
	}

	@Override
	public List<Jugador> listarTodosJugadores() {
		// TODO Auto-generated method stub
		return jpaRepositorio.listarTodosJugadores()
				.stream().map(entityMapper:: toDomain).toList();
	}

	@Override
	public List<Jugador> buscarJugadorNombre(String nombre) {
		// TODO Auto-generated method stub
		return jpaRepositorio.buscarJugadorNombre(nombre)
				.stream().map(entityMapper:: toDomain).toList();
	}

}
