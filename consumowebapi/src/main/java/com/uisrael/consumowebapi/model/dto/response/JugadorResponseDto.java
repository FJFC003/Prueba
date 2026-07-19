package com.uisrael.consumowebapi.model.dto.response;

import java.util.Date;

import lombok.Data;


@Data
public class JugadorResponseDto {

	private int idJugador;
	private String nombre;
	private String apellidos;
	private String ci;
	
	private Date fechaNacimiento;
	private boolean estadoRegsitro;
	
}
