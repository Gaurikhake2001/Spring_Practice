package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Watch {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Watch() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Watch [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("start");
	}
	
	@PreDestroy
	public void finish() {
		System.out.println("finish");
	}

}
