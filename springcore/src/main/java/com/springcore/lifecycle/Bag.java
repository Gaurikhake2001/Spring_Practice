package com.springcore.lifecycle;

public class Bag {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Bag() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bag [price=" + price + "]";
	}
	
	public void start()
	{
		System.out.println("start");
	}
	
	public void end()
	{
		System.out.println("finish");
	}
}
