package com.uisrael.campeonato.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.campeonato.aplicacion.casosuso.entradas.IEquipoUseCase;
import com.uisrael.campeonato.dominio.entidades.Equipo;
import com.uisrael.campeonato.presentacion.dto.request.EquipoRequestDto;
import com.uisrael.campeonato.presentacion.dto.response.EquipoResponseDto;
import com.uisrael.campeonato.presentacion.mapeadores.IEquipoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/campeonato/equipo")
public class EquipoController {

	private final IEquipoUseCase equipoUseCase;
	private final IEquipoDtoMapper mapper;

	public EquipoController(IEquipoUseCase equipoUseCase, IEquipoDtoMapper mapper) {
		this.equipoUseCase = equipoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public EquipoResponseDto guardar(@Valid @RequestBody EquipoRequestDto requestEquipo) {
		return mapper.toResponseDto(equipoUseCase.guardar(mapper.toDomain(requestEquipo)));

	}

	@GetMapping
	public List<EquipoResponseDto> listarTodos()
	{
		return equipoUseCase.listarTodos().stream()
				.map(mapper :: toResponseDto).toList();
	}
	
	@DeleteMapping("/{idEquipo}")
	public ResponseEntity<Void> eliminar(@PathVariable int idEquipo){
		equipoUseCase.eliminar(idEquipo);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{nombres}")
	public List<EquipoResponseDto> findByNombres(@PathVariable String nombres){
		return equipoUseCase.findByNombres(nombres).stream()
				.map(mapper :: toResponseDto).toList();
	}
}
