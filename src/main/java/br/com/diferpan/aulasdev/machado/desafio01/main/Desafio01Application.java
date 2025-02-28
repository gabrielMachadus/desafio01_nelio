package br.com.diferpan.aulasdev.machado.desafio01.main;

import br.com.diferpan.aulasdev.machado.desafio01.entities.Order;
import br.com.diferpan.aulasdev.machado.desafio01.services.OrderService;
import br.com.diferpan.aulasdev.machado.desafio01.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"br.com.diferpan.aulasdev.machado.desafio01"})
public class Desafio01Application implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Order order = readData();
		Order order1 = new Order(1034,150.0,20.0);
		Order order2 = new Order(2282,800.0,20.0);
		Order order3 = new Order(1309,95.90,0.0);

		System.out.println("\nPedido código "+order1.getCode());
		System.out.println("Valor Total: R$ "+orderService.total(order1));

		System.out.println("\nPedido código "+order2.getCode());
		System.out.println("Valor Total: R$ "+orderService.total(order2));

		System.out.println("\nPedido código "+order3.getCode());
		System.out.println("Valor Total: R$ "+orderService.total(order3));


	}

}
