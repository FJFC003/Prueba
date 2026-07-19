package com.uisrael.campeonato.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.campeonato.dominio.entidades.Equipo;
import com.uisrael.campeonato.infraestructura.persistencia.jpa.EquipoEntity;

@Mapper(componentModel = "spring")
public interface IEquipoJpaMapper {

	Equipo toDomain(EquipoEntity entity);

	EquipoEntity toEntity(Equipo equipoPojo);
}
