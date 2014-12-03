package edu.nyu.cs.designpatterns.chapter04.pizzafm;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new NYStyleCheesePizza();
        }
        else if (type == PizzaType.VEGGIE) {
            return new NYStyleVeggiePizza();
        }
        else if (type == PizzaType.CLAM) {
            return new NYStyleClamPizza();
        }
        else if (type == PizzaType.PEPPERONI) {
            return new NYStylePepperoniPizza();
        }
        return null;
    }

}
