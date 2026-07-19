package com.uisrael.campeonato.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.campeonato.dominio.entidades.Equipo;
import com.uisrael.campeonato.dominio.repositorio.IEquipoRepositorio;
import com.uisrael.campeonato.infraestructura.persistencia.jpa.EquipoEntity;
import com.uisrael.campeonato.infraestructura.persistencia.mapeadores.IEquipoJpaMapper;
import com.uisrael.campeonato.infraestructura.repositorio.IEquipoJpaRepositorio;

public class EquipoRepositorioImpl implements IEquipoRepositorio {

	private final IEquipoJpaRepositorio jpaRepositorio;
	private final IEquipoJpaMapper entityMapper;

	public EquipoRepositorioImpl(IEquipoJpaRepositorio jpaRepositorio, IEquipoJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Equipo guardar(Equipo nuevaEquipo) {
		EquipoEntity entity = entityMapper.toEntity(nuevaEquipo);
		EquipoEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Equipo> buscarPorId(int idEquipo) {
		return jpaRepositorio.findById(idEquipo).map(entityMapper::toDomain);
	}

	@Override
	public List<Equipo> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idEquipo) {
		jpaRepositorio.deleteById(idEquipo);
	}

	@Override
	public List<Equipo> findByNombres(String nombres) {
		// TODO Auto-generated method stub
		return jpaRepositorio.findByNombres(nombres).stream().map(entityMapper::toDomain).toList();
	}
	

}
