package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteReposiroty {
	
	public void ingresar(Estudiante estudiante);
	public List<Estudiante> buscar();

}
