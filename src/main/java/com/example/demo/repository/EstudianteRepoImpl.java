package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorNombreQuery(String nombre) {
		// select * from estudiante where estu_nombre='Willian'
		// select e from Estudiante e where e.nombre= :datoNombre
		Query jplQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre ");
		jplQuery.setParameter("datoNombre", nombre); // Datos que voy a enlazar datoNombre ---> nombre
		// Retorna tipos de objetos generico por lo que se debe castear a estudiante
		return (Estudiante) jplQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellidoQuery(String apellido) {
		// select * from estudiante where estu_apellido='Conlago'
		// select e from Estudiante e where e.apellido= :datoNombre
		Query jplQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido ");
		jplQuery.setParameter("datoApellido", apellido); // Datos que voy a enlazar datoApellido ---> apellido
		// Retorno tipos de objetos genericos por lo que se debe castear al datoq ue
		// debe retornar
		return (Estudiante) jplQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPoGeneroQuery(String genero) {

		Query jplQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jplQuery.setParameter("datoGenero", genero); // Datos que voy a enlazar datoGenero---> genero
		return (Estudiante) jplQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		Query jplQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = : datoCiudad");
		jplQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jplQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		Query jplQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula= : datoCedula");
		jplQuery.setParameter("datoCedula", cedula);
		return (Estudiante) jplQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreTypedQuery(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager
				.createQuery("select e from Estudiante e where e.nombre = :datoNombre ", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNamedQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNom");
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNom",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
//		select * from estudiante where estu_nombre='Willian'
		Query myQuery = this.entityManager.createNativeQuery("select * from estudiante where estu_nombre= :datoNombre",Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante)myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante)myQuery.getSingleResult(); // retorna typed mediante un named
	}

}
