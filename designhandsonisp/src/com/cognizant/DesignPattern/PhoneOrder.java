package com.cognizant.DesignPattern;

public class PhoneOrder implements IOrder {

	@Override
	public void ProcessOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(modelName +" order accepted!");
	}

}
