package com.uisrael.campeonato.infraestructura.persistencia.jpa;

import java.util.ArrayList;
import java.util.Date;
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
@Table(name = "equipo")
public class EquipoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipo;
	private String nombres;
	private String direccion;
	private String observacion;
	private Date fechaFundacion;
	private boolean estadoRegistro;
	private String colores;

	@OneToMany(mappedBy ="fkEquipoEntity" )
	private List<JugadorEntity> listaJugadores= new ArrayList<>();
	
	@OneToMany(mappedBy ="fkEquipoEntity" )
	private List<CategoriaEquipoEntity> listaCategorias= new ArrayList<>();
}
