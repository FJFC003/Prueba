package com.uisrael.campeonato.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.campeonato.dominio.entidades.Categoria;

import com.uisrael.campeonato.infraestructura.persistencia.jpa.CategoriaEntity;

@Mapper(componentModel = "spring")
public interface ICategoriaJpaMapper {

	Categoria toDomain(CategoriaEntity entity);

	CategoriaEntity toEntity(Categoria categoriaPojo);
}
