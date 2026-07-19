package com.uisrael.campeonato.dominio.entidades;


public class Categoria {

	private int idCategoria;
	private String nombre;
	private String descripcion;
	private boolean estadoRegistro;
	
	public Categoria(int idCategoria, String nombre, String descripcion, boolean estadoRegistro) {
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estadoRegistro = estadoRegistro;
	}
	public Categoria() {
		super();
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(boolean estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	
	
	
	
}
