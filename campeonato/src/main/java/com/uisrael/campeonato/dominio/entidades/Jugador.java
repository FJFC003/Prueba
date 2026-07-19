package com.uisrael.campeonato.dominio.entidades;

import java.util.Date;



public class Jugador {

	private int idJugador;
	private String nombre;
	private String apellidos;
	private String ci;
	private Date fechaNacimiento;
	private boolean estadoRegsitro;
	private Equipo fkEquipo;
	
	public int getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public boolean isEstadoRegsitro() {
		return estadoRegsitro;
	}
	public void setEstadoRegsitro(boolean estadoRegsitro) {
		this.estadoRegsitro = estadoRegsitro;
	}
	public Equipo getFkEquipo() {
		return fkEquipo;
	}
	public void setFkEquipo(Equipo fkEquipo) {
		this.fkEquipo = fkEquipo;
	}
	
	
}
