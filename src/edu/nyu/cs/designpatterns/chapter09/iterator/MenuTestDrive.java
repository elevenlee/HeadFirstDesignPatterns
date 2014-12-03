package edu.nyu.cs.designpatterns.chapter09.iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {

    public static void main(String[] args) {
        List<Iterable<MenuItem>> menus = new ArrayList<Iterable<MenuItem>>();
        menus.add(new DinerMenu());
        menus.add(new PancakeHouseMenu());
        menus.add(new CafeMenu());
        
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }

}
