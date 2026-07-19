package com.uisrael.campeonato.infraestructura.persistencia.jpa;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "jugador")
public class JugadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJugador;
    @Column(length = 80)
	private String nombre;
	private String apellidos;
	private String ci;
	private Date fechaNacimiento;
	private boolean estadoRegsitro;
	@ManyToOne (cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	@JoinColumn(name = "fk_equipo")
	private EquipoEntity fkEquipoEntity;
	
	
}
