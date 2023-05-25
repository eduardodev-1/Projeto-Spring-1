package com.eduardodev.desafio.services;

import org.springframework.stereotype.Service;

import com.eduardodev.desafio.entities.Order;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class ShippingService {

	public double shipment(Order order) {
		
		if (order.getBasic() < 100) {
			return 20;
			
		} else if (order.getBasic() >= 100 && order.getBasic() < 200) {
			return 12;
			
		} else {
			return 0;
		}
	}
}
