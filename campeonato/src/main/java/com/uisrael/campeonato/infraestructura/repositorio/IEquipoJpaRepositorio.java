package com.uisrael.campeonato.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.campeonato.infraestructura.persistencia.jpa.EquipoEntity;
import java.util.List;


public interface IEquipoJpaRepositorio extends JpaRepository<EquipoEntity, Integer> {

	List<EquipoEntity> findByNombres(String nombres);
	
	List<EquipoEntity> findByDireccion(String direccion);
}


