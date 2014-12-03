package edu.nyu.cs.designpatterns.chapter08.sort;

@SuppressWarnings("rawtypes")
public class Duck implements Comparable {
    private String name;
    private int weight;
    
    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return name + " weights " + weight;
    }
    
    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck) object;
        
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {    // this.weight > otherDuck.weight
            return 1;
        }
    }

}
