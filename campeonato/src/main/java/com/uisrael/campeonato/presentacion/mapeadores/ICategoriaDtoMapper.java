package com.uisrael.campeonato.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.campeonato.dominio.entidades.Categoria;
import com.uisrael.campeonato.presentacion.dto.request.CategoriaRequestDto;
import com.uisrael.campeonato.presentacion.dto.response.CategoriaResponseDto;

@Mapper(componentModel = "spring")
public interface ICategoriaDtoMapper {

	Categoria toDomain(CategoriaRequestDto dto);
	
	CategoriaResponseDto toResponseDto(Categoria categoriaPojo);
}
