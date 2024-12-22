package com.vi.designpatternbyvineesha.structural.decorator;

public class MilkDecorator extends CoffeeDecorator{

	public MilkDecorator(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription() +",milk";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost() +1.5;  //adding milk cost of 1.5
	}

}
