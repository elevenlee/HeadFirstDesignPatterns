package edu.nyu.cs.designpatterns.chapter09.composite;

public class Waitress {
    private final MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    
    public void printMenu() {
        allMenus.print();
    }
    
    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n----");
        for (MenuComponent menuComponent : allMenus) {
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
                
            }
        }
    }
    
}
