package br.com.diferpan.aulasdev.machado.desafio01.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.diferpan.aulasdev.machado.desafio01"})
public class Desafio01Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("------- Iniciando programa -------");
	}
}
