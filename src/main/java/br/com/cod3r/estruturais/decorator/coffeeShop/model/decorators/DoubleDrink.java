package br.com.cod3r.estruturais.decorator.coffeeShop.model.decorators;


import br.com.cod3r.estruturais.decorator.coffeeShop.model.Drink;

public class DoubleDrink extends DrinkDecorator {

    public DoubleDrink(Drink drink) {
       super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 3.90;
    }
}