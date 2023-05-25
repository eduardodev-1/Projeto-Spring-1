package com.eduardodev.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardodev.desafio.entities.Order;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		return order.getBasic() - order.getBasic() * order.getDiscount() / 100 + shippingService.shipment(order);
	}
}
