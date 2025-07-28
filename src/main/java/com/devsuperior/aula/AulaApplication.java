package com.devsuperior.aula;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.controllers.OrderController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.devsuperior"})
public class AulaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AulaApplication.class, args);
    }
    
    private OrderController orderController;
    	
    public AulaApplication(OrderController orderController) {
    	this.orderController = orderController; 
    }
    

	@Override
	public void run(String... args) throws Exception {
		orderController.start(); 
		
	}
}
