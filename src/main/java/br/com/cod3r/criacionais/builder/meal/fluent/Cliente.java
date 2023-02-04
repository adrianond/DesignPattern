package br.com.cod3r.criacionais.builder.meal.fluent;

import br.com.cod3r.criacionais.builder.meal.fluent.builder.FastFoodMealBuilder;
import br.com.cod3r.criacionais.builder.meal.fluent.model.FastFoodMeal;

public class Cliente {
	
	public static void main(String[] args) {
		
		FastFoodMeal burguerCombo = new FastFoodMealBuilder()
				.addMain("CheeseBurger")
				.addDrink("Coke")
				.getFastFoodMeal();
		System.out.println(burguerCombo);
		
		System.out.println("--------------------------------------------");
		
		
		FastFoodMeal dessert = new FastFoodMealBuilder()
				.addDessertk("cake")
				.addDrink("soda")
				.getFastFoodMeal();
		System.out.println(dessert);
	}

}
