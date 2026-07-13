package com.uisrael.prototipogestalabweb.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uisrael.prototipogestalabweb.dto.EmpleadoDto;

@Service
public class EmpleadoService {
	
	@Autowired
    private RestTemplate restTemplate;

    // URL base de la API de tu proyecto GestaLab (Ajusta la ruta según tu Controller)
    private final String BACKEND_URL = "http://localhost:8080/api/empleados"; 

    public List<EmpleadoDto> obtenerTodos() {
        // Hacemos una petición GET y mapeamos la respuesta a un arreglo de EmpleadoDto
        EmpleadoDto[] empleados = restTemplate.getForObject(BACKEND_URL, EmpleadoDto[].class);
        return Arrays.asList(empleados);
    }

    public void guardar(EmpleadoDto empleado) {
        // Hacemos una petición POST enviando el objeto 'empleado' en el cuerpo de la petición
        restTemplate.postForObject(BACKEND_URL, empleado, EmpleadoDto.class);
    }

}
