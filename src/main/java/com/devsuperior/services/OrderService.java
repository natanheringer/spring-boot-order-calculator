package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.entities.Order;

@Service
public class OrderService {



    private DiscountService discountService;
    private ShippingService shippingService;
	
    @Autowired
    public OrderService(DiscountService discountService, ShippingService shippingService) {
		this.discountService = discountService;
		this.shippingService = shippingService;
	}
    
    public double calculateTotalValue (Order order) {
    	
    	double valueWithDiscount = discountService.calculateValueWithDiscount(order.getBasicValue(), order.getDiscountPercentage()); 
    	double shipping = shippingService.calculateShipping(valueWithDiscount);
    	return valueWithDiscount + shipping;
    }
    
    
    
    public void printOrderSummary(Order order) {
    	double totalValue = calculateTotalValue(order);
    	
    	System.out.println("Pedido código: " + order.getCode());
    	System.out.printf("Valor total: R$ %.2f%n", totalValue);
    }
} 