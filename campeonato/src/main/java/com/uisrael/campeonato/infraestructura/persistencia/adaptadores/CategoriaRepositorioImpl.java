package com.uisrael.campeonato.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.campeonato.dominio.entidades.Categoria;
import com.uisrael.campeonato.dominio.repositorio.ICategoriaRepositorio;
import com.uisrael.campeonato.infraestructura.persistencia.jpa.CategoriaEntity;
import com.uisrael.campeonato.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.uisrael.campeonato.infraestructura.repositorio.ICategoriaJpaRepositorio;

public class CategoriaRepositorioImpl implements ICategoriaRepositorio {

	private final ICategoriaJpaRepositorio jpaRepositorio;
	private final ICategoriaJpaMapper entityMapper;

	public CategoriaRepositorioImpl(ICategoriaJpaRepositorio jpaRepositorio, ICategoriaJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Categoria guardar(Categoria nuevaCategoria) {
		CategoriaEntity entity = entityMapper.toEntity(nuevaCategoria);
		CategoriaEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Categoria> buscarPorId(int idCategoria) {
		return jpaRepositorio.findById(idCategoria).map(entityMapper::toDomain);
	}

	@Override
	public List<Categoria> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idCategoria) {
		jpaRepositorio.deleteById(idCategoria);

	}

}
