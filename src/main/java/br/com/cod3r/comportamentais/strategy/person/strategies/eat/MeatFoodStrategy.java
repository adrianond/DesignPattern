package br.com.cod3r.comportamentais.strategy.person.strategies.eat;

public class MeatFoodStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("I eat meat!");
	}
	
}
