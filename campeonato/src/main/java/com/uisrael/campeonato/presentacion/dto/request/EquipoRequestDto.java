package com.uisrael.campeonato.presentacion.dto.request;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EquipoRequestDto {

	private int idEquipo;
	@NotBlank
	private String nombres;
	@NotBlank
	private String direccion;
	@NotBlank
	private String observacion;
	@NotBlank
	private Date fechaFundacion;
	@NotBlank
	private boolean estadoRegistro;
	@NotBlank
	private String colores;
}
