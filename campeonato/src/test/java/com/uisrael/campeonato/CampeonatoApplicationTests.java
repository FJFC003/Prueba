package com.uisrael.campeonato;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.campeonato.infraestructura.persistencia.jpa.EquipoEntity;
import com.uisrael.campeonato.infraestructura.persistencia.jpa.JugadorEntity;
import com.uisrael.campeonato.infraestructura.repositorio.IEquipoJpaRepositorio;
import com.uisrael.campeonato.infraestructura.repositorio.IJugadorJpaRepositorio;

@SpringBootTest
class CampeonatoApplicationTests {

	@Autowired
	IJugadorJpaRepositorio repoJugador;
	@Autowired
	IEquipoJpaRepositorio repoEquipo;
	
	@Test
	void contextLoads() {
		//Jugador
		JugadorEntity nuevo= new JugadorEntity();
		nuevo.setNombre("Mario");
		nuevo.setApellidos("Pérez");
		repoJugador.save(nuevo);
		System.out.println(nuevo.getNombre()+" "+ nuevo.getApellidos());
		
		//**Equipo
		EquipoEntity nuevoEq= new EquipoEntity();
		nuevoEq.setNombres("El Nacho");
		nuevoEq.setColores("rojo");
		nuevoEq.setFechaFundacion(new Date());
		nuevoEq.setDireccion("Tumbaco");
		nuevoEq.setEstadoRegistro(true);
		repoEquipo.save(nuevoEq);
	}

}
