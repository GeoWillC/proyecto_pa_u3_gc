package com.example.demo.repository;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {

public Estudiante buscarPorNombreQuery(String nombre);
public Estudiante buscarPorApellidoQuery(String apellido);
public Estudiante buscarPoGeneroQuery(String genero);
public Estudiante buscarPorCiudadQuery(String ciudad);
public Estudiante buscarPorCedulaQuery(String cedula);
}
