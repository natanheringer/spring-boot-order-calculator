package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class DiscountService {
    
   
	public double calculateDiscount(double basicValue, double discountPercentage) {
		
		return basicValue * (discountPercentage / 100.0);
		
	}
	
	public double calculateValueWithDiscount(double basicValue, double discountPercentage) {
		
		double discount = calculateDiscount(basicValue, discountPercentage);
		return basicValue - discount;
	}
	
	
} 