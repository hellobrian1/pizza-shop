package edu.iu.habahram.pizzashop.model;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{

	public Dough[] createDough() {
		Dough dough[] = { new ThickCrustDough() };
		return dough;
	}

	public Sauce[] createSauce() {
		Sauce sauce[] = { new PlumTomatoSauce() };
		return sauce;
	}

	public Cheese[] createCheese() {
		Cheese cheese[] = { new MozzarellaCheese() };
		return cheese;
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni[] createPepperoni() {
		Pepperoni pepperoni[] = { new SlicedPepperoni() };
		return pepperoni;
	}

	public Clams[] createClam() {
		Clams clams[] = { new FrozenClams() };
		return clams;
	}
}
