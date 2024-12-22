package com.vi.designpatternbyvineesha.structural.decorator;

public class NormalCoffee implements Coffee{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "simple coffee";
		
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 5.0;
		
	}

}
