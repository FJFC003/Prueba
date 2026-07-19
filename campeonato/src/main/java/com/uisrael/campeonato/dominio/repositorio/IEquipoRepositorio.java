package com.uisrael.campeonato.dominio.repositorio;

import java.util.List;
import java.util.Optional;


import com.uisrael.campeonato.dominio.entidades.Equipo;
import com.uisrael.campeonato.infraestructura.persistencia.jpa.EquipoEntity;

public interface IEquipoRepositorio {

	Equipo guardar(Equipo nuevaEquipo);

	Optional<Equipo> buscarPorId(int idEquipo);

	List<Equipo> listarTodos();

	void eliminar(int idEquipo);
	
	List<Equipo> findByNombres(String nombres);
}

