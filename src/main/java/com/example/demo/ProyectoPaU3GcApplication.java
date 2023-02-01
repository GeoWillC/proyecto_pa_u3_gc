package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3GcApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService iEstudianteService; 
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3GcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		System.out.println(this.iEstudianteService.buscarPorApellido("Conlago"));
		System.out.println(this.iEstudianteService.buscarPorNombre("George"));

	}

}
