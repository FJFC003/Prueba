package com.uisrael.campeonato.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.campeonato.dominio.entidades.Jugador;
import com.uisrael.campeonato.presentacion.dto.request.JugadorRequestDto;
import com.uisrael.campeonato.presentacion.dto.response.JugadorResponseDto;

@Mapper(componentModel = "spring")
public interface IJugadorDtoMapper {

	Jugador toDomain(JugadorRequestDto dto);

	JugadorResponseDto toResponseDto(Jugador jugadorPojo);
}
