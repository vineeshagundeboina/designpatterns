package com.vi.designpatternbyvineesha.structural.decorator;

public class SugarDecorator extends CoffeeDecorator{
	
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}
	

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription() +",sugar";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost()+0.5;
	}

}
