package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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
		Query myQuery = this.entityManager.createNativeQuery("select * from estudiante where estu_nombre= :datoNombre",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);

		return myQuery.getSingleResult(); // retorna typed mediante un named
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryList(String nombre) {
		// select e from Estudiante e where e.nombre= :datoNombre
		Query jplQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre ");
		jplQuery.setParameter("datoNombre", nombre); // Datos que voy a enlazar datoNombre ---> nombre
		// Retorna tipos de objetos generico por lo que se debe castear a estudiante
		return jplQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estudiante buscarPorNombreQueryFirst(String nombre) {
		Query jplQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre ");
		jplQuery.setParameter("datoNombre", nombre); // Datos que voy a enlazar datoNombre ---> nombre
		// Retorna tipos de objetos generico por lo que se debe castear a estudiante
		return (Estudiante) jplQuery.getResultList().get(0);
	}

	@Override
	public EstudianteDTO buscarPorNombreTypedQueryDTO(String nombre) {
		TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager.createQuery(
				"select NEW com.example.demo.modelo.dto.EstudianteDTO(e.nombre,e.apellido,e.cedula) from Estudiante e where e.nombre = :datoNombre ",
				EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getResultList().get(0);
	}

	@Override
	public Estudiante buscaPorNombreCriteria(String nombre) {
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		//Especificamos el tipo de retorno de mi query
		CriteriaQuery<Estudiante> myQuery=myBuilder.createQuery(Estudiante.class);
		//Empieza la creacion de SQL en base a metodos
		//Se define la tabla destino, from ----- sera tomado la ruta principal root 
		Root<Estudiante> myTablaRoot= myQuery.from(Estudiante.class);
//		Las condiciones where se conocen en criteria PAI query como predicados
		//equal(la columna que voy a comprar,)
//		e.nombre = :datoNombre
//		myTablaRoot.nombre=:datoNombre
		Predicate condicion1= myBuilder.equal(myTablaRoot.get("nombre"),nombre);
		myQuery.select(myTablaRoot).where(condicion1);
//		Fin SQL, falta ejecucion
//		Se ejecuta mediante con cualquier tipo ya conocido, remendacion typedquery
		TypedQuery<Estudiante> mySQL=this.entityManager.createQuery(myQuery);
		
		
		return mySQL.getResultList().get(0);
	}

	@Override
	public List<Estudiante> buscaPorNombreCriteriaAndOr(String nombre,String apellido,String genero) {
		CriteriaBuilder myBuilder=this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Estudiante> myQuery=myBuilder.createQuery(Estudiante.class);
		Root<Estudiante> myTablaRoot= myQuery.from(Estudiante.class);
		Predicate condicion1=myBuilder.equal(myTablaRoot.get("nombre"), nombre);
		Predicate condicion2=myBuilder.equal(myTablaRoot.get("apellido"), apellido);
//		Genero		
//		M: e.nombre= AND e.apellido=
//		F: e.nombre= OR e.apellido=		
		Predicate predicadoFinal=null;
		
		if(genero.equals("M")) {
//			Predicado AND
			predicadoFinal=myBuilder.and(condicion1,condicion2);			
		}else {
//			Predicado OR
			predicadoFinal=myBuilder.or(condicion1,condicion2);			
		}
		//Ejecucion
		myQuery.select(myTablaRoot).where(predicadoFinal);
		
		TypedQuery<Estudiante> mySQL= this.entityManager.createQuery(myQuery);

				
		return mySQL.getResultList();
	}
	
}






