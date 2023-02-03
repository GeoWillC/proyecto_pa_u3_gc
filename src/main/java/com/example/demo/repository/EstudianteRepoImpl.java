package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		//select * from estudiante where estu_nombre='Willian'
		//select e from Estudiante e where e.nombre= :datoNombre
		Query jplQuery=this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre ");
		jplQuery.setParameter("datoNombre", nombre);		//Datos que voy a enlazar  datoNombre ---> nombre
		//Retorna tipos de objetos generico por lo que se debe castear a estudiante
		return (Estudiante)jplQuery.getSingleResult();			
	}
	

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		//select * from estudiante where estu_apellido='Conlago'
		//select e from Estudiante e where e.apellido= :datoNombre
			Query jplQuery=this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido ");
			jplQuery.setParameter("datoApellido", apellido);	//Datos que voy a enlazar  datoApellido ---> apellido
			//Retorno tipos de objetos genericos por lo que se debe castear al datoq ue debe retornar
		return (Estudiante)jplQuery.getSingleResult();
	}


	@Override
	public Estudiante buscarPoGeneroQuery(String genero) {

		Query jplQuery= this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jplQuery.setParameter("datoGenero", genero); 	//Datos que voy a enlazar datoGenero---> genero 
		return (Estudiante)jplQuery.getSingleResult();
	}


	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		Query jplQuery=this.entityManager.createQuery("select e from Estudiante e where e.ciudad = : datoCiudad");
		jplQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante)jplQuery.getSingleResult();
	}


	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		Query jplQuery= this.entityManager.createQuery("select e from Estudiante e where e.cedula= : datoCedula");
		jplQuery.setParameter("datoCedula",cedula);
		return (Estudiante)jplQuery.getSingleResult();
	}
	

}
