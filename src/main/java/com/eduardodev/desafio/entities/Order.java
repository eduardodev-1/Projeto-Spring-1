package com.eduardodev.desafio.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	
	private Integer code;
	private Double basic;
	private Double discount;
	
	public Order() {
	}
	public Order(Integer code, Double basic, Double discount) {
		super();
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}
}
