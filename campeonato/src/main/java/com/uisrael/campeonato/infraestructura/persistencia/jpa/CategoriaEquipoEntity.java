package com.uisrael.campeonato.infraestructura.persistencia.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "categoria_equipo")
public class CategoriaEquipoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoriaEquipo;
	private String observacion;
	private String estadoRegistro;
	@ManyToOne
	@JoinColumn(name = "fk_categoria")
	private CategoriaEntity fkCategoriaEntity;
	@ManyToOne
	@JoinColumn(name = "fk_equipo")
	private EquipoEntity fkEquipoEntity;
}
