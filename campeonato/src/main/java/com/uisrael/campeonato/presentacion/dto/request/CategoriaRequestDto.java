package com.uisrael.campeonato.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoriaRequestDto {

	private int idCategoria;
	@NotBlank
	private String nombre;
	private String descripcion;
	private boolean estadoRegistro;
}
