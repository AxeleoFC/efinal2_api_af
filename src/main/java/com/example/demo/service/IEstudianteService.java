package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {
	public void ingresar(Estudiante estudiante);
	public List<Estudiante> buscar();

}
