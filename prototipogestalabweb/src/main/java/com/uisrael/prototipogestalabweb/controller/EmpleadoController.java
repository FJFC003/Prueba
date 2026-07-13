package com.uisrael.prototipogestalabweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.uisrael.prototipogestalabweb.dto.EmpleadoDto;
import com.uisrael.prototipogestalabweb.services.EmpleadoService;


@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public String listarEmpleados(Model model) {
        // Se conecta al backend, trae la lista y la pasa a la vista
        model.addAttribute("listaEmpleados", empleadoService.obtenerTodos());
        return "empleado/listar"; 
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        // Instancia un DTO vacío para que Thymeleaf arme el formulario
        model.addAttribute("empleado", new EmpleadoDto());
        return "empleado/nuevo";
    }

    @PostMapping("/guardar")
    public String guardarEmpleado(@ModelAttribute EmpleadoDto empleado) {
        // Recibe los datos del form HTML y los envía al backend mediante el servicio
        empleadoService.guardar(empleado);
        return "redirect:/empleados"; // Redirige a la lista
    }

}
