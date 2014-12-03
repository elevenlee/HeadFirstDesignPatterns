package edu.nyu.cs.designpatterns.chapter04.pizzaaf;

public abstract class PizzaStore {

    public final Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        
        pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    protected abstract Pizza createPizza(PizzaType type);
    
    // other method here
    
}
