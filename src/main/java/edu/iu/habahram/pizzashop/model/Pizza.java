package edu.iu.habahram.pizzashop.model;

public abstract class Pizza {
    String name;

    Dough[] dough;
    Sauce[] sauce;
    Veggies[] veggies;
    Cheese[] cheese;
    Pepperoni[] pepperoni;
    Clams[] clam;

    StringBuffer state = new StringBuffer();

    abstract void prepare();

    void bake() {
        state.append("Baked for 25 minutes at 350");
        state.append("\n");
    }

    void cut() {
        state.append("Cutting the pizza into diagonal slices");
        state.append("\n");
    }

    void box() {
        state.append("Placed pizza in official PizzaStore box");
        state.append("\n");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");

        if (dough != null) {
            for (int i = 0; i < dough.length; i++) {
                result.append(dough[i]);
                result.append("\n");
            }
        }

        if (sauce != null) {
            for (int i = 0; i < sauce.length; i++) {
                result.append(sauce[i]);
                result.append("\n");
            }
        }

        if (cheese != null) {
            for (int i = 0; i < cheese.length; i++) {
                result.append(cheese[i]);
                result.append("\n");
            }
        }

        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }

        if (clam != null) {
            for (int i = 0; i < clam.length; i++) {
                result.append(clam[i]);
                result.append("\n");
            }
        }

        if (pepperoni != null) {
            for (int i = 0; i < pepperoni.length; i++) {
                result.append(pepperoni[i]);
                result.append("\n");
            }
        }

        return result.toString() + state.toString();
    }

}

