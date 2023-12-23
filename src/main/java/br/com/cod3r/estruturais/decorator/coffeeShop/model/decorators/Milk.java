package br.com.cod3r.estruturais.decorator.coffeeShop.model.decorators;

import br.com.cod3r.estruturais.decorator.coffeeShop.model.Drink;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        System.out.println("- Adding 30ml of milk");
       drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 30d;
    }
}
