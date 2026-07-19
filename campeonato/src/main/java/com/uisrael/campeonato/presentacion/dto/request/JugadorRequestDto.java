package com.uisrael.campeonato.presentacion.dto.request;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class JugadorRequestDto {

	private int idJugador;
	@NotBlank
	private String nombre;
	@NotBlank
	private String apellidos;
	@NotBlank
	private String ci;
	@NotBlank
	private Date fechaNacimiento;
	@NotBlank
	private boolean estadoRegsitro;
	
}
