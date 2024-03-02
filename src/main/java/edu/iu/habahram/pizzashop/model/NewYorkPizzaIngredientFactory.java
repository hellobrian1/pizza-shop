package edu.iu.habahram.pizzashop.model;



public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory
{

    public Dough[] createDough() {
        Dough dough[] = { new ThinCrustDough() };
        return dough;
    }

    public Sauce[] createSauce() {
        Sauce sauce[] = { new MarianaSauce() };
        return sauce;
    }

    public Cheese[] createCheese() {
        Cheese cheese[] = { new ReggianoCheese() };
        return cheese;
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Onions(),
                new RedPeppers() };
        return veggies;
    }

    public Pepperoni[] createPepperoni() {
        Pepperoni pepperoni[] = {
                new SlicedPepperoni() };
        return pepperoni;
    }

    public Clams[] createClam() {
        Clams clams[] = { new FreshClams() };
        return clams;
    }
}
