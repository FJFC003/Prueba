package com.uisrael.campeonato.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.campeonato.dominio.entidades.Equipo;
import com.uisrael.campeonato.presentacion.dto.request.EquipoRequestDto;
import com.uisrael.campeonato.presentacion.dto.response.EquipoResponseDto;

@Mapper(componentModel = "spring")
public interface IEquipoDtoMapper {

	Equipo toDomain(EquipoRequestDto dto);

	EquipoResponseDto toResponseDto(Equipo equipoPojo);
}
