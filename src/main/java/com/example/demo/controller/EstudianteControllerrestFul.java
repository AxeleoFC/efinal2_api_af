package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.to.EstudianteTo;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteControllerrestFul {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public void ingresarEstudiante(@RequestBody EstudianteTo estudiante) {
		System.out.println(estudiante);
		this.estudianteService.ingresar(estudiante.convertir());
	}
	
	@GetMapping(path = "/lista")
	public List<Estudiante> lista(){
		return this.estudianteService.buscar();
	}

}
