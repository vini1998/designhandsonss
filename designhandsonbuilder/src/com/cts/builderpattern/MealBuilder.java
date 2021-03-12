package com.cts.builderpattern;

public class MealBuilder {

	public Meal prepareVegMeal() {

		Meal meal = new Meal();

		meal.addItem(new VegBurger());
		meal.addItem(new ChickenBurger());

		meal.addItem(new Coke());
		meal.addItem(new Pepsi());

		return meal;

	}

}