package com.devsuperior.controllers;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;

@Component
public class OrderController {
		
		private OrderService orderService;
		private Scanner scanner;
		
		@Autowired
		public OrderController(OrderService orderService) {
			this.orderService = orderService;
			this.scanner = new Scanner(System.in);
			this.scanner.useLocale(Locale.US);
		}


		public void start() {
		
			System.out.println("=== Sistema de Pedidos ===");
		
			while(true) {
				System.out.println("\nDigite os dados do pedido: \n");
				
				System.out.println("\nCódigo do pedido: \n");
				int code = scanner.nextInt();
				
				System.out.println("\nValor básico: \n");
				double basicValue = scanner.nextDouble();
				
				System.out.println("\nPorcentagem de desconto: \n");
				double discountPercentage = scanner.nextDouble();
				
				Order order = new Order(code, basicValue, discountPercentage);
				orderService.printOrderSummary(order);
				
				System.out.print("\nDeseja continuar (S/n)?");
				String continueOption = scanner.next();
				
				if(!continueOption.equalsIgnoreCase("s")) {
					break;
				}
				
	
			}
			
			System.out.println("Programa finalizado!");
			scanner.close();
			
		}
		
}
