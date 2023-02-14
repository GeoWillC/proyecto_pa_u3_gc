package com.example.demo.repository;

import java.util.ArrayList;
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
public class HotelRepoImpl implements IHotelRepo {

	@PersistenceContext
	private EntityManager entityManager;

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
		myQuery.setParameter("datoDir", direccion);
		return myQuery.executeUpdate();
	}

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// JPQL: select from hotel h inner join habitacion ha on h.id=ha.id where
		// ha.id=:datoEntrada
		Query myQuery = this.entityManager.createQuery(
				// join con la relacion que comparten la relacion sql ya no es necesario
				// on no es necesario ya que la relacion esta internamente
				"select h from Hotel h inner join h.habitacion ha where ha.tipo=:datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		//Bajo demanda
		List<Hotel> listaHoteles=myQuery.getResultList();
		
		for (Hotel hotel : listaHoteles) {
			//traer solamente si
			List<Habitacion> listTemp=new ArrayList<>();
			for(Habitacion ha:hotel.getHabitacion()) {
				if(ha.getTipo().equals(tipoHabitacion))
					listTemp.add(ha);
			}
			
				hotel.getHabitacion().size();
			hotel.setHabitacion(listTemp);
			
		}
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelLeftJoin(String tipoHabitacion) {
		// JPQL: select from hotel h inner join habitacion ha on h.id=ha.id where
		// ha.id=:datoEntrada
		Query myQuery = this.entityManager.createQuery(
				// join con la relacion que comparten la relacion sql ya no es necesario
				// on no es necesario ya que la relacion esta internamente
				"select h from Hotel h left join h.habitacion ha where ha.tipo=:datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		//Bajo demanda
		List<Hotel> listaHoteles=myQuery.getResultList();
		for (Hotel hotel : listaHoteles) {
			hotel.getHabitacion().size();
		}
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelRightJoin(String tipoHabitacion) {
		// JPQL: select from hotel h inner join habitacion ha on h.id=ha.id where
		// ha.id=:datoEntrada
		Query myQuery = this.entityManager.createQuery(
				// join con la relacion que comparten la relacion sql ya no es necesario
				// on no es necesario ya que la relacion esta internamente
				"select h from Hotel h right join h.habitacion ha where ha.tipo=:datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		//Bajo demanda
		List<Hotel> listaHoteles=myQuery.getResultList();
		for (Hotel hotel : listaHoteles) {
			hotel.getHabitacion().size();
		}
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}
}
