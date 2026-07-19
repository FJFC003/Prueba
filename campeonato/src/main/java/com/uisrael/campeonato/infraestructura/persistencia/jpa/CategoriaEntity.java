package com.uisrael.campeonato.infraestructura.persistencia.jpa;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categotria")
public class CategoriaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;
	private String nombre;
	private String descripcion;
	private boolean estadoRegistro;

	@OneToMany(mappedBy = "fkCategoriaEntity")
	private List<CategoriaEquipoEntity> listaCateEquip=
			new ArrayList<>();
}
