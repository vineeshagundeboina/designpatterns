package com.vi.designpatternbyvineesha.creational.factory;

public class CarFactory {


		
		
		public Car getCar(String carType ) {
			if(carType==null) {
				return null;
			}
			else if(carType.equalsIgnoreCase("Audi")){
				
				return new Audi();
				
			}
			else if(carType.equalsIgnoreCase("Tata")) {
				return new Tata();
			}
			else if(carType.equalsIgnoreCase("Suv")) {
				return new Suv();
			}
			
			return null;
			
		}
	
}
