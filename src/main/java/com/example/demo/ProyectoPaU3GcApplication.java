package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IEstudianteRepo;
import com.example.demo.service.IAutomovilService;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IEstudianteService;
import com.example.demo.service.IHabitacionService;
import com.example.demo.service.IHotelService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU3GcApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService iEstudianteService; 
	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IClienteService iClienteService;
	@Autowired
	private IRentaService iRentaService;
	
	@Autowired
	private IAutomovilService iAutomovilService;
	
	@Autowired
	private IHotelService iHotelService;
	
	@Autowired
	private IHabitacionService iHabitacionService;
		
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3GcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//14/2/2023
		//FETCH
		
//		List<Hotel> lista2=this.iHotelService.buscarHotelFetchJoin("VIP");
//		for (Hotel hotel : lista2) {
//			System.out.println(hotel.getNombre());
//			for (Habitacion ha : hotel.getHabitacion()) {
//				System.out.println("La habitaciones de "+hotel.getNombre()+" son " +ha );
//			}
//		System.out.println();
//		}	
		//LEFT Hotel
//		List<Hotel> lista=this.iHotelService.buscarHotelLeftJoin();
//		for (Hotel hotel : lista) {
//			System.out.println(hotel.getNombre());
////			for (Habitacion ha : hotel.getHabitacion()) {
////				System.out.println(ha.getNumero());
////			}
//		}	
		//Left Hotel
//		System.out.println("Habitacion Left");
//		List<Habitacion> listaha=this.iHabitacionService.buscarHabitacionLeftJoin();
//		for (Habitacion hab : listaha) {
//			//Ternario
//			System.out.println(hab!=null?hab.getNumero():null);
//		}	
//		
		//Right derecha habitacion
		//Right hotel
		System.out.println("Hotel Right");
		List<Hotel> lista=this.iHotelService.buscarHotelRightJoin();
		for (Hotel hotel : lista) {
			System.out.println(hotel!=null?hotel.getNombre():null);
		}	
		//Right habitacion
		System.out.println("Habitacion Right");
		List<Habitacion> listaha=this.iHabitacionService.buscarHabitacionRightJoin();
		for (Habitacion hab : listaha) {
			//Ternario
			if(hab.getHotel()!=null) {
				System.out.println(hab.getHotel());
			}else {
				System.out.println("null");
			}
//			System.out.println(hab!=null?hab.getHotel():null);
//			System.out.println(hab.getHotel());
		}	
		
	}

}
