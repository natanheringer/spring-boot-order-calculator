package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	public double calculateShipping(double orderValue) {

		if (orderValue < 100) {
			return 20;
		} else if (orderValue >= 100 && orderValue < 200) {
			return 12;
		} else {
			return 0.0;
		}

	}
}