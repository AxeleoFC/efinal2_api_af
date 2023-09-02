package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteReposiroty;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteReposiroty estudianteReposiroty;
	
	@Override
	public void ingresar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteReposiroty.ingresar(estudiante);
	}

	@Override
	public List<Estudiante> buscar() {
		// TODO Auto-generated method stub
		return this.estudianteReposiroty.buscar();
	}

}
