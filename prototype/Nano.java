package com.java.prototype;


//We have prototype as BaseCar and doing some changes only
public class Nano extends BaseCar{

	Nano(String modelName){
		this.modelName = modelName;
	}
	
	@Override
	public Nano clone() throws CloneNotSupportedException{
		return (Nano) super.clone();
	}
}
