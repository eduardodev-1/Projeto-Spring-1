package com.eduardodev.desafio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eduardodev.desafio.entities.Order;
import com.eduardodev.desafio.services.OrderService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dados do pedido: ");
		System.out.print("código: ");
		int code = sc.nextInt();
		System.out.print("valor básico: ");
		double basic = sc.nextDouble();
		System.out.print("porcentagem do desconto: ");
		double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println();
		System.out.println("Pedido código: " + order.getCode());
		System.out.printf("Valor Total: R$ %.2f", orderService.total(order));
		sc.close();
	}
}
