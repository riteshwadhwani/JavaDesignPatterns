package com.java.prototype;

import java.util.Random;

public class BaseCar implements Cloneable {
	public int BasePrice ;
	protected String modelName;
	
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setOnRoadPrice() {
		Random rnd = new Random();
		int p = rnd.nextInt(100000);
		this.BasePrice = this.BasePrice + p;
	}
	
	public BaseCar clone() throws CloneNotSupportedException{
		return (BaseCar)super.clone();
	}
}
