package com.uisrael.prototipogestalabweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@GetMapping
    public String listarEmpleados(Model model) {
        // TODO: Consumir la API REST de GestaLab (backend) usando RestTemplate o FeignClient
        // List<EmpleadoDto> empleados = empleadoService.obtenerTodos();
        // model.addAttribute("listaEmpleados", empleados);
        
        return "empleado/listar"; // Retorna la vista HTML
    }

    // Mostrará el Formulario de Nuevo
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        // Se envía un objeto vacío para ser mapeado con th:object
        // model.addAttribute("empleado", new EmpleadoDto());
        return "empleado/nuevo";
    }

    // Procesará el Guardado
    @PostMapping("/guardar")
    public String guardarEmpleado(/* @ModelAttribute EmpleadoDto empleado */) {
        // TODO: Enviar el objeto capturado en el formulario al backend GestaLab
        // empleadoService.guardar(empleado);
        
        // Redirige a la lista tras guardar exitosamente
        return "redirect:/empleados";
    }

}
