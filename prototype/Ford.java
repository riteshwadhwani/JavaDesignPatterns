package com.java.prototype;

public class Ford extends BaseCar{
	
	Ford(String modelName){
		this.modelName = modelName;
	}

	@Override
	public Ford clone() throws CloneNotSupportedException {
		
		return (Ford) super.clone();
	}
	
	
}
