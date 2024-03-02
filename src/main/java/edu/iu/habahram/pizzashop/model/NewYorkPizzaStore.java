package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        PizzaFactory pizzaFactory = new NewYorkPizzaFactory();
        return pizzaFactory.createPizza(item);
    }
}
