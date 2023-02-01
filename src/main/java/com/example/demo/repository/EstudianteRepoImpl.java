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
		Query jplQuery=this.entityManager.createQuery("select e from Estudiante e where e.nombre= :datoNombre ");
		jplQuery.setParameter("datoNombre", jplQuery);
		//Retorna tipos de objetos generico por lo que se debe castear a estudiante
		return (Estudiante)jplQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
