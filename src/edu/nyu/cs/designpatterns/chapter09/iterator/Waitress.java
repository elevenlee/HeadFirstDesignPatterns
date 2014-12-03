package edu.nyu.cs.designpatterns.chapter09.iterator;

import java.util.List;

public class Waitress {
    private final List<Iterable<MenuItem>> menus;
    
    public Waitress(List<Iterable<MenuItem>> menus) {
        this.menus = menus;
    }
    
    public void printMenu() {
        for (Iterable<MenuItem> menu : menus) {
            printMenu(menu);
        }
    }
    
    private void printMenu(Iterable<MenuItem> iterable) {
        for (MenuItem menuItem : iterable) {
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
    
    // other methods here
}
