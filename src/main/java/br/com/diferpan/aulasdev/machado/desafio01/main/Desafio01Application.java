package br.com.diferpan.aulasdev.machado.desafio01.main;

import br.com.diferpan.aulasdev.machado.desafio01.entities.Order;
import br.com.diferpan.aulasdev.machado.desafio01.services.OrderService;
import br.com.diferpan.aulasdev.machado.desafio01.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"br.com.diferpan.aulasdev.machado.desafio01"})
public class Desafio01Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = readData();
		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(shippingService);
		System.out.println("Pedido código "+order.getCode());
		System.out.println("Valor Total: R$ "+orderService.total(order));
	}

	private Order readData() {
		Order order = new Order();
		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite o código do Pedido: ");
		order.setCode(sc.nextInt());

		System.out.println(" Digite o total do Pedido: ");
		order.setBasic(sc.nextDouble());
		System.out.println(" Digite o desconto do Pedido: ");
		order.setDiscount(sc.nextDouble());

		sc.close();
		return order;
	}
}
