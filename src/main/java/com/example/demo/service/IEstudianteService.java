package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

public interface IEstudianteService {
	
	public void insertar(Estudiante estudiante);
	public Estudiante buscarPorNombre(String nombre);
	public Estudiante buscarPorApellido(String apellido);
	public Estudiante buscarPoGenero(String genero);
	public Estudiante buscarPorCiudad(String ciudad);
	public Estudiante buscarPorCedula(String cedula);
	public Estudiante buscarPorNombreTyped(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
	
	//First
	public Estudiante buscarPorNombreQueryFirst(String nombre);
	
	//Listas
	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	
	//Estudiante simple
	public EstudianteDTO buscarPorNombreTypedQueryDTO(String nombre);

	//Criteria Api query
	public Estudiante buscaPorNombreCriteria(String nombre);
	
	public List<Estudiante> buscaPorNombreCriteriaAndOr(String nombre,String apellido,String bandera);
	
	public int eliminarPorApellido(String apellido);
	
	public int actualizarPorApellido(String apellido,String nombre);
	
}
