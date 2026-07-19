package com.uisrael.campeonato.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.campeonato.infraestructura.persistencia.jpa.CategoriaEntity;

public interface ICategoriaJpaRepositorio extends JpaRepository<CategoriaEntity, Integer> {

}
