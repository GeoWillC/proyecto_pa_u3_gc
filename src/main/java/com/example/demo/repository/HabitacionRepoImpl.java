package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HabitacionRepoImpl implements IHabitacionRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Habitacion> buscarHabitacionLeftJoin() {
		Query myQuery = this.entityManager.createQuery(
				"select ha from Hotel h left join h.habitacion ha", Habitacion.class);
		List<Habitacion> list=myQuery.getResultList();
			return list;
	}

	@Override
	public List<Habitacion> buscarHabitacionRightJoin() {
		Query myQuery = this.entityManager.createQuery(
				"select ha from Hotel h right join h.habitacion ha", Habitacion.class);
			return myQuery.getResultList();
			
//			for (Hotel h : listHotel) {
//				h.getHabitacion().size();
//			}
//			return listHotel;
	}

	@Override
	public List<Habitacion> buscarHabitacionFullJoin() {
		// TODO Auto-generated method stub
		return null;
	}




	
}
