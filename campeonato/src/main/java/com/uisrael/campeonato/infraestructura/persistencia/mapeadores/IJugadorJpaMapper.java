package com.uisrael.campeonato.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.campeonato.dominio.entidades.Jugador;
import com.uisrael.campeonato.infraestructura.persistencia.jpa.JugadorEntity;

@Mapper(componentModel = "spring")
public interface IJugadorJpaMapper {

	Jugador toDomain(JugadorEntity entity);
	
	JugadorEntity toEntity(Jugador jugadorPojo);
}
