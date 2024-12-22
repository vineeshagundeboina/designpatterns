package com.vi.designpatternbyvineesha.structural.decorator;

public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// normal coffee
		Coffee myCoffee=new NormalCoffee();
		System.out.println(myCoffee.getDescription()+"  $"+myCoffee.getCost());
		
		
		// add extra milk
		myCoffee=new MilkDecorator(myCoffee);
		System.out.println(myCoffee.getDescription()+"  $"+myCoffee.getCost());
		
		//add extra sugar
		
		myCoffee=new SugarDecorator(myCoffee);
		System.out.println(myCoffee.getDescription()+"  $"+myCoffee.getCost());

		//add extra cream
		myCoffee=new CreamDecorator(myCoffee);
		System.out.println(myCoffee.getDescription()+"  $"+myCoffee.getCost());

		System.out.println("final cost : "+myCoffee.getCost());


	}

}
