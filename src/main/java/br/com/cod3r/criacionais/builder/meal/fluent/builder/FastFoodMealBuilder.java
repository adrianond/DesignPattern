package br.com.cod3r.criacionais.builder.meal.fluent.builder;

import br.com.cod3r.criacionais.builder.meal.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {
	
	private String drink;
	private String main;
	private String side;
	private String dessert;
	private String gift;
	
	public FastFoodMealBuilder addDrink(String drink) {
		this.drink = drink;
		return this;
	}

	public FastFoodMealBuilder addMain(String main) {
		this.main = main;
		return this;
	}

	public FastFoodMealBuilder addSide(String side) {
		this.side = side;
		return this;
	}

	public FastFoodMealBuilder addDessertk(String dessert) {
		this.dessert = dessert;
		return this;
	}

	public FastFoodMealBuilder addGift(String gift) {
		this.gift = gift;
		return this;
	}

	public FastFoodMeal getFastFoodMeal() {
		return new FastFoodMeal(drink, main, side, dessert, gift);
		
	}
}
