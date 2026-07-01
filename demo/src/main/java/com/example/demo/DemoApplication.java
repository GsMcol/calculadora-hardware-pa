package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner probarORM(EvaluacionRepository repo) {
		return (args) -> {
			System.out.println("\n--- INICIANDO ORM (HIBERNATE) ---");
			
			// 1. Creamos un objeto Java normal con hardware de gama alta
			Evaluacion test1 = new Evaluacion("Ryzen 9 9950X3D", "NVIDIA RTX 5090", "Rendimiento Optimo - Sin Cuello de Botella");
			
			// 2. El ORM lo guarda en la base de datos automáticamente
			repo.save(test1);
			
			// 3. Le pedimos al ORM que nos traiga todo lo que hay en la base de datos
			System.out.println("Extrayendo datos desde la Base de Datos H2:");
			for (Evaluacion e : repo.findAll()) {
				System.out.println(e.toString());
			}
			System.out.println("--- ORM FINALIZADO CON EXITO ---\n");
		};
	}
}