package br.com.diferpan.aulasdev.machado.desafio01.main;

import br.com.diferpan.aulasdev.machado.desafio01.entities.Order;
import br.com.diferpan.aulasdev.machado.desafio01.services.OrderService;
import br.com.diferpan.aulasdev.machado.desafio01.services.ShippingService;
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
		Order order = new Order(111,95.90,0.0);
		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(shippingService);
		System.out.println("Pedido código "+order.getCode());
		System.out.println("Valor Total: R$ "+orderService.total(order));
	}
}
