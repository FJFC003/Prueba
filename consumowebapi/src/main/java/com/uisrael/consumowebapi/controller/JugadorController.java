package com.uisrael.consumowebapi.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uisrael.consumowebapi.model.dto.request.JugadorRequestDto;
import com.uisrael.consumowebapi.model.dto.response.JugadorResponseDto;
import com.uisrael.consumowebapi.service.IJugadorService;

@Controller
@RequestMapping("/jugadores")
public class JugadorController {
	
    @Autowired
	private IJugadorService servicioJugador;
	
	@GetMapping
	public String listarJugador(Model model) {
		List<JugadorResponseDto> jugadoresBD=servicioJugador.listarJugadores();
	    model.addAttribute("listajugadores", jugadoresBD); 
		return "/jugador/listarjugador";
	}
	
	@GetMapping("/nuevo")
	public String nuevoJugador(Model model) {
		model.addAttribute("jugador", new JugadorRequestDto());
		return "/jugador/crearjugador";
	}
	
	@PostMapping("/guardar")
	public String guardarJugador(@ModelAttribute JugadorRequestDto jugador) {
		jugador.setFechaNacimiento(new Date());
		servicioJugador.guardarJugador(jugador);
		return "redirect:/jugadores";
	}
	
}
