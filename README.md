# Spring Boot Order Calculator

A Spring Boot application that demonstrates dependency injection and service layer patterns for calculating order totals with shipping and discount calculations.

## Features

- **Order Management**: Order entity with proper encapsulation
- **Discount Calculation**: Percentage-based discount calculation
- **Shipping Calculation**: Dynamic shipping costs based on order value
- **Service Layer**: Clean separation of concerns with Spring services
- **Dependency Injection**: Proper Spring dependency injection using constructor injection

  ## Business Logic

The application calculates order totals as follows:

- **Basic Value**: Original order amount
- **Discount**: Percentage-based reduction
- **Shipping**: 
  - Below $100: $20 shipping
  - $100-$200: $12 shipping  
  - Above $200: Free shipping
- **Total**: Basic Value - Discount + Shipping

## Input Format

- Use dot (.) as decimal separator: 150.00, not 150,00
- Enter order code as integer
- Enter basic value and discount percentage as decimal numbers
