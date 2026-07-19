package com.uisrael.campeonato.infraestructura.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uisrael.campeonato.infraestructura.persistencia.jpa.JugadorEntity;

public interface IJugadorJpaRepositorio extends JpaRepository<JugadorEntity, Integer> {

	@Query("Select j from JugadorEntity j")
	List<JugadorEntity> listarTodosJugadores();
	@Query("Select j from JugadorEntity j where j.nombre=?1")
	List<JugadorEntity> buscarJugadorNombre(String nombre);
	
	@Query("Select j from JugadorEntity j where j.nombre=?1 and j.estadoRegsitro=?2")
	List<JugadorEntity> buscarJugadorNombre(String nombre, boolean estado);
}
