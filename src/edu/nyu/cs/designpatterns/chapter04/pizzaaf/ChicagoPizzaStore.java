package edu.nyu.cs.designpatterns.chapter04.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        
        if (type == PizzaType.CHEESE) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if (type == PizzaType.VEGGIE) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        }
        else if (type == PizzaType.CLAM) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        else if (type == PizzaType.PEPPERONI) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }

}
