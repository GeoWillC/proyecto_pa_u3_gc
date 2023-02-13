package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepoImpl implements IHotelRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		// Para la eliminacion y actualizacion query
//		JPQL: delete from estudiante where estu_apellido="Conlago"
		Query myQuery = this.entityManager.createQuery("delete from Hotel h where h.nombre=:datoEntrada");
		myQuery.setParameter("datoEntrada", nombre);
		return myQuery.executeUpdate();
	}

	@Override
	public int actualizarPorNombre(String nombre, String direccion) {
		// TODO Auto-generated method stub
//		JPQL: update estudiante set estu_nombre=''Edison where estu_apellido="Conlago"
		Query myQuery = this.entityManager
				.createQuery("update Hotel h set h.direccion=:datoDir where h.nombre =:datoNombre");
		myQuery.setParameter("datoNombre", nombre);
		myQuery.setParameter("datoDir",direccion);
		return myQuery.executeUpdate();
	}
}
