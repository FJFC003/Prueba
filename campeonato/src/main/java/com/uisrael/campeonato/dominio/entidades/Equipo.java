package com.uisrael.campeonato.dominio.entidades;

import java.util.Date;

public class Equipo {

	private int idEquipo;
	private String nombres;
	private String direccion;
	private String observacion;
	private Date fechaFundacion;
	private boolean estadoRegistro;
	private String colores;
	
	public int getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Date getFechaFundacion() {
		return fechaFundacion;
	}
	public void setFechaFundacion(Date fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
	public boolean isEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(boolean estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	public String getColores() {
		return colores;
	}
	public void setColores(String colores) {
		this.colores = colores;
	}
	
	
}
