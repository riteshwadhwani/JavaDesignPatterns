package com.java.prototype;

public class PrototypeTest {
	public static void main(String[] args) {
		Ford fordCar = new Ford("Ford");
		fordCar.BasePrice = 500000;
		fordCar.setOnRoadPrice();
		
		Nano nanoCar = new Nano("Nano");
		nanoCar.BasePrice = 100000;
		nanoCar.setOnRoadPrice();
		
		System.out.println(fordCar.getModelName() + " " + fordCar.BasePrice);
		System.out.println(nanoCar.getModelName() + " " + nanoCar.BasePrice);
		
	}
}
