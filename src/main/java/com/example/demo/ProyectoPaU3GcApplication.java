package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IEstudianteRepo;
import com.example.demo.service.IAutomovilService;
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
	
	@Autowired
	private IAutomovilService iAutomovilService;
		
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3GcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Automoviles
//		Automovil automovil1=new Automovil();
//		automovil1.setColor("Amarillo");
//		automovil1.setDisponibilidad(true);
//		automovil1.setMarca("Toyota");
//		automovil1.setNumeroSerie("1G1RC6E42B");
//		automovil1.setPlaca("ABC-123");
//		automovil1.setPrecio(new BigDecimal(15000));
//		automovil1.setTransmicion("A");
//		
//		Automovil automovil2=new Automovil();
//		automovil2.setColor("Azul");
//		automovil2.setDisponibilidad(true);
//		automovil2.setMarca("Chevrolet");
//		automovil2.setNumeroSerie("1G1RC6E42C");
//		automovil2.setPlaca("ABC-124");
//		automovil2.setPrecio(new BigDecimal(16000));
//		automovil2.setTransmicion("M");
//		
//		Automovil automovil3=new Automovil();
//		automovil3.setColor("Rojo");
//		automovil3.setDisponibilidad(false);
//		automovil3.setMarca("Hyundai");
//		automovil3.setNumeroSerie("1G1RC6E42D");
//		automovil3.setPlaca("ABC-125");
//		automovil3.setPrecio(new BigDecimal(17000));
//		automovil3.setTransmicion("M");
//		
//		
//		this.iAutomovilService.insertar(automovil1);
//		this.iAutomovilService.insertar(automovil2);
//		this.iAutomovilService.insertar(automovil3);
		
		//Placa
		//1
		System.out.println("Consulta 1 "+this.iAutomovilService.buscarPorPlacaTypedQuery("ABC-123"));
		//2
		System.out.println("Consulta 2 "+this.iAutomovilService.buscarPorPlacaNativeQuery("ABC-124"));
		//3
		System.out.println("Consulta 3 "+this.iAutomovilService.buscarPorPlacaNamedQuery("ABC-125"));
		//4
		System.out.println("Consulta 4 "+this.iAutomovilService.buscarPorPlacaNamedNativeQuery("ABC-123"));
		//Marca
		System.out.println("Consulta 5 "+this.iAutomovilService.buscarPorMarcaTypedQuery("Hyundai"));
		//2
		System.out.println("Consulta 6 "+this.iAutomovilService.buscarPorMarcaNativeQuery("Chevrolet"));
		//3
		System.out.println("Consulta 7 "+this.iAutomovilService.buscarPorMarcaNamedQuery("Toyota"));
		//4
		System.out.println("Consulta 8 "+this.iAutomovilService.buscarPorMarcaNamedNativeQuery("Hyundai"));
		//Color
		System.out.println("Consulta 9 "+this.iAutomovilService.buscarPorColorTypedQuery("Amarillo"));
		//2
		System.out.println("Consulta 10 "+this.iAutomovilService.buscarPorColorNativeQuery("Rojo"));
		//3
		System.out.println("Consulta 11 "+this.iAutomovilService.buscarPorColorNamedQuery("Azul"));
		//4
		System.out.println("Consulta 12 "+this.iAutomovilService.buscarPorColorNamedNativeQuery("Rojo"));
		
	}

}
