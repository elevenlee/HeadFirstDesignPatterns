package edu.nyu.cs.designpatterns.chapter04.pizzaaf;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;
    
    abstract void prepare();
    
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    
    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (null != name) {
            sb.append(name + " -- ");
        }
        if (null != dough) {
            sb.append(dough + ", ");
        }
        if (null != sauce) {
            sb.append(sauce + ", ");
        }
        if (null != veggies) {
            for (int i = 0; i < veggies.length; i++) {
                sb.append(veggies[i] + ", ");
            }
        }
        if (null != cheese) {
            sb.append(cheese + ", ");
        }
        if (null != pepperoni) {
            sb.append(pepperoni + ", ");
        }
        if (null != clam) {
            sb.append(clam + ";");
        }
        
        return sb.toString();
    }
    
}
