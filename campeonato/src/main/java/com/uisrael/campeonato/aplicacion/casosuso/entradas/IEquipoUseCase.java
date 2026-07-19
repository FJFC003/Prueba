package com.uisrael.campeonato.aplicacion.casosuso.entradas;

import java.util.List;


import com.uisrael.campeonato.dominio.entidades.Equipo;

public interface IEquipoUseCase {

	Equipo guardar(Equipo nuevaEquipo);

	Equipo buscarPorId(int idEquipo);

	List<Equipo> listarTodos();

	void eliminar(int idEquipo);
	
	List<Equipo> findByNombres(String nombres);
}
