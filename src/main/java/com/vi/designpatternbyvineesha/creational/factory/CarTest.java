package com.vi.designpatternbyvineesha.creational.factory;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarFactory factory=new CarFactory();
		Car audi=factory.getCar("audi");
		audi.assemble();
		
		Car suv=factory.getCar("suv");
		suv.assemble();
		
		Car tata=factory.getCar("tata");
		tata.assemble();
		
//		Car mn=factory.getCar("mun");
//		mn.assemble();
		

	}

}
