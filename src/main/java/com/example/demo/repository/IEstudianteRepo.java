package com.example.demo.repository;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {

public Estudiante buscarPorNombreQuery(String nombre);
public Estudiante buscarPorApellidoQuery(String apellido);

}
