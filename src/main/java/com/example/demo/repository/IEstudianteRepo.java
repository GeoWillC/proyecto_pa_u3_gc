package com.example.demo.repository;

import com.example.demo.modelo.Estudiante;

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
}
