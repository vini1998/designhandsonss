package com.cts.builderpattern;

public class ChickenBurger extends Burger{
	
	@Override
	public float price() {

		return 25.0f;

	}

	@Override
	public String name() {

		return "Chicken Burger";

	}
}
