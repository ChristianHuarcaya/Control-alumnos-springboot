package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	/*	Estudiante estudinate1 = new Estudiante("Christian","huarcaya","crist@gmail.com");
	//	repositorio.save(estudinate1);
		
	//	Estudiante estudinate2 = new Estudiante("Alison","mendoza","Alison@gmail.com");
		//repositorio.save(estudinate2);
		 
		 */
	}

}
