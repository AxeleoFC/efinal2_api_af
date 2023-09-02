package com.example.demo.service.to;

import java.io.Serializable;

import com.example.demo.repository.modelo.Estudiante;

public class EstudianteTo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String cedula;
	
	@Override
	public String toString() {
		return "EstudianteTo [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}
	public Estudiante convertir() {
		Estudiante estudiante=new Estudiante();
		estudiante.setNombre(this.nombre);
		estudiante.setApellido(this.apellido);
		estudiante.setCedula(this.cedula);
		return estudiante;
	}
	
	//Set y Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
