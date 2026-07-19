package com.uisrael.consumowebapi.model.dto.request;

import java.util.Date;

import lombok.Data;

@Data
public class EquipoRequestDto {

	private int idEquipo;
	private String nombres;
	private String direccion;
	private String observacion;
	private Date fechaFundacion;
	private boolean estadoRegistro;
	private String colores;
}
