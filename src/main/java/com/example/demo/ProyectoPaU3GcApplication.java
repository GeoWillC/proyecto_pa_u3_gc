package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IEstudianteService;
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
		
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3GcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		System.out.println(this.iEstudianteService.buscarPorApellido("Conlago"));
//		System.out.println("Busqueda 1 "+this.iEstudianteService.buscarPorNombre("Willian"));
//		System.out.println("Busqueda 2 "+this.iEstudianteService.buscarPoGenero("F"));
//		System.out.println("Busqueda 3 "+this.iEstudianteService.buscarPorApellido("Conlago"));
//		System.out.println("Busqueda 4 "+this.iEstudianteService.buscarPorCiudad("Cuenca"));
//		System.out.println("Busqueda 5 "+this.iEstudianteService.buscarPorCedula("1751242668"));
		
		//Vehiculo
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setColor("rojo");
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("ACC-0123");
		vehiculo.setPrecioDia(new BigDecimal(50));
		
		Cliente cliente=new Cliente();
		cliente.setApellido("Conlago");
		cliente.setCedula("1751242668");
		cliente.setDiasRenta(new BigDecimal(12));
		cliente.setNombre("Willian");
		cliente.setTarjetaCredito("5540500001000004");
	
		this.iClienteService.agregar(cliente);
		this.iVehiculoService.agregar(vehiculo);
		this.iRentaService.rentar(cliente.getCedula(), vehiculo.getPlaca());
		
	}

}
