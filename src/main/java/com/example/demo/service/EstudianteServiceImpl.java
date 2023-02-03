package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepo iEstudianteRepo;
	
	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreQuery(nombre);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorApellidoQuery(apellido);
	}

	@Override
	public Estudiante buscarPoGenero(String genero) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPoGeneroQuery(genero);
	}

	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorCiudadQuery(ciudad);
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorCedulaQuery(cedula);
	}
	

}
