package edu.nyu.cs.designpatterns.chapter04.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new ChicagoStyleCheesePizza();
        }
        else if (type == PizzaType.VEGGIE) {
            return new ChicagoStyleVeggiePizza();
        }
        else if (type == PizzaType.CLAM) {
            return new ChicagoStyleClamPizza();
        }
        else if (type == PizzaType.PEPPERONI) {
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }

}
