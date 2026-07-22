package com.uisrael.campeonato.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.campeonato.aplicacion.casosuso.entradas.IJugadorUseCase;
import com.uisrael.campeonato.dominio.entidades.Jugador;
import com.uisrael.campeonato.presentacion.dto.request.EquipoRequestDto;
import com.uisrael.campeonato.presentacion.dto.request.JugadorRequestDto;
import com.uisrael.campeonato.presentacion.dto.response.EquipoResponseDto;
import com.uisrael.campeonato.presentacion.dto.response.JugadorResponseDto;
import com.uisrael.campeonato.presentacion.mapeadores.IJugadorDtoMapper;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/campeonato/jugador")
public class JugadorController {

	private final IJugadorUseCase jugadorUseCase;
	private final IJugadorDtoMapper mapper;

	public JugadorController(IJugadorUseCase jugadorUseCase, IJugadorDtoMapper mapper) {
		super();
		this.jugadorUseCase = jugadorUseCase;
		this.mapper = mapper;
	}
	

	@GetMapping("/query")
	public List<JugadorResponseDto>listarTodosJugador(){
		return jugadorUseCase.listarTodosJugadores()
				.stream().map(mapper:: toResponseDto).toList();
	}

	@GetMapping("/buscar/{nombre}/{estado}")
	public List<JugadorResponseDto> listarTodos(@PathVariable String nombre, @PathVariable boolean estado) {
		return jugadorUseCase.buscarJugadorNombre(nombre, estado)
				.stream().map(mapper::toResponseDto).toList();
	}
	
	@GetMapping("/buscar/{nombre}")
	List<JugadorResponseDto> buscarJugadorNombre(@PathVariable String nombre){
		return jugadorUseCase.buscarJugadorNombre(nombre)
				.stream().map(mapper:: toResponseDto).toList();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public JugadorResponseDto guardar(@Valid @RequestBody JugadorRequestDto requestJugador) {          
		return mapper.toResponseDto(jugadorUseCase.guardar(mapper.toDomain(requestJugador)));

	}
	
	@GetMapping("/buscarId/{idJugador}")
	public JugadorResponseDto buscarJugadorId(@PathVariable int idJugador){
		return mapper.toResponseDto(jugadorUseCase.findById(idJugador));

	}
}
