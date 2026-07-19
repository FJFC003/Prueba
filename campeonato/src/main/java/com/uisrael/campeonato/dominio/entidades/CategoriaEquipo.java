package com.uisrael.campeonato.dominio.entidades;

import com.uisrael.campeonato.infraestructura.persistencia.jpa.CategoriaEntity;
import com.uisrael.campeonato.infraestructura.persistencia.jpa.EquipoEntity;



public class CategoriaEquipo {

	private int idCategoriaEquipo;
	private String observacion;
	private String estadoRegistro;
	private CategoriaEntity fkCategoriaEntity;
	private EquipoEntity fkEquipoEntity;
	
	public int getIdCategoriaEquipo() {
		return idCategoriaEquipo;
	}
	public void setIdCategoriaEquipo(int idCategoriaEquipo) {
		this.idCategoriaEquipo = idCategoriaEquipo;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(String estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	public CategoriaEntity getFkCategoriaEntity() {
		return fkCategoriaEntity;
	}
	public void setFkCategoriaEntity(CategoriaEntity fkCategoriaEntity) {
		this.fkCategoriaEntity = fkCategoriaEntity;
	}
	public EquipoEntity getFkEquipoEntity() {
		return fkEquipoEntity;
	}
	public void setFkEquipoEntity(EquipoEntity fkEquipoEntity) {
		this.fkEquipoEntity = fkEquipoEntity;
	}
	
	
}
