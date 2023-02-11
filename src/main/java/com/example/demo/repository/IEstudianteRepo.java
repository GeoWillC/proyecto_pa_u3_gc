package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

public interface IEstudianteRepo {

public void insertar(Estudiante estudiante);
public Estudiante buscarPorNombreQuery(String nombre);
public Estudiante buscarPorApellidoQuery(String apellido);

public Estudiante buscarPoGeneroQuery(String genero);

public Estudiante buscarPorCiudadQuery(String ciudad);

public Estudiante buscarPorCedulaQuery(String cedula);

public Estudiante buscarPorNombreTypedQuery(String nombre);

public Estudiante buscarPorNombreNamedQuery(String nombre);

public Estudiante buscarPorNombreNamedQueryTyped(String nombre);

public Estudiante buscarPorNombreNativeQuery(String nombre);

public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);

//Fisrt result retorna un elemento
public Estudiante buscarPorNombreQueryFirst(String nombre);

//Multiples retornos
public List <Estudiante> buscarPorNombreQueryList(String nombre);



public List <Estudiante> buscarPorNombreNamedQueryList(String nombre);

public List <Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);

//Reduccion de dimensionalidad
public EstudianteDTO buscarPorNombreTypedQueryDTO(String nombre);

//Querys dinamicos
public Estudiante buscaPorNombreCriteria(String nombre);

public List<Estudiante> buscaPorNombreCriteriaAndOr(String nombre,String apellido,String bandera);

public int eliminarPorApellido(String apellido);
public int actualizarPorApellido(String apellido,String nombre);
}
