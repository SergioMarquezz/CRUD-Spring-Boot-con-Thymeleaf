package com.crud.web;

import com.crud.web.dao.EstudianteDaoJpa;
import com.crud.web.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudThymeleafApplication implements CommandLineRunner {

	@Autowired
	private EstudianteDaoJpa estudianteJpa;
	public static void main(String[] args) {
		SpringApplication.run(SpringCrudThymeleafApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Estudiante primerEstudiante = new Estudiante("Sergio Alberto","Marquez","sergiomarquezmoreno@gmail.com");
		estudianteJpa.save(primerEstudiante);
		Estudiante segundoEstudiante = new Estudiante("Ma Lourdes","Rodriguez","lulurv@gmail.com");
		estudianteJpa.save(segundoEstudiante);
*/
	}
}
