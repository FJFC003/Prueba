package com.uisrael.campeonato.infraestructura.configuraciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.campeonato.aplicacion.casosuso.entradas.IEquipoUseCase;
import com.uisrael.campeonato.aplicacion.casosuso.entradas.IJugadorUseCase;
import com.uisrael.campeonato.aplicacion.casosuso.impl.EquipoUseCaseImpl;
import com.uisrael.campeonato.aplicacion.casosuso.impl.JugadorUseCaseImpl;
import com.uisrael.campeonato.dominio.repositorio.IEquipoRepositorio;
import com.uisrael.campeonato.dominio.repositorio.IJugadorRepositorio;
import com.uisrael.campeonato.infraestructura.persistencia.adaptadores.EquipoRepositorioImpl;
import com.uisrael.campeonato.infraestructura.persistencia.adaptadores.JugadorRepositorioImpl;
import com.uisrael.campeonato.infraestructura.persistencia.mapeadores.IEquipoJpaMapper;
import com.uisrael.campeonato.infraestructura.persistencia.mapeadores.IJugadorJpaMapper;
import com.uisrael.campeonato.infraestructura.repositorio.IEquipoJpaRepositorio;
import com.uisrael.campeonato.infraestructura.repositorio.IJugadorJpaRepositorio;

@Configuration
public class CampeonatoConfig {

	/*Equipo*/
	@Bean
	IEquipoRepositorio equipoRepositorio(IEquipoJpaRepositorio jpaRepositorio, IEquipoJpaMapper mapper) {
		return new EquipoRepositorioImpl(jpaRepositorio, mapper);
	}
	@Bean
	IEquipoUseCase equipoUseCase(IEquipoRepositorio repo) {
		return new EquipoUseCaseImpl(repo);
	}
	
	/*jugador*/
	@Bean
	IJugadorRepositorio jugadorRepositorio(IJugadorJpaRepositorio jpaRepositorio, IJugadorJpaMapper mapper) {
		return new JugadorRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	IJugadorUseCase jugadorUseCase(IJugadorRepositorio repo) {
		return new JugadorUseCaseImpl(repo);
	}
}
