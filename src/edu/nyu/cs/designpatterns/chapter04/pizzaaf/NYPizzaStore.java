package edu.nyu.cs.designpatterns.chapter04.pizzaaf;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        
        if (type == PizzaType.CHEESE) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if (type == PizzaType.VEGGIE) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        else if (type == PizzaType.CLAM) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        else if (type == PizzaType.PEPPERONI) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }

}
