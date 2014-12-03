package edu.nyu.cs.designpatterns.chapter09.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DinerMenu implements Iterable<MenuItem> {
    public static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems;
    
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true,
                2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false,
                2.99);
        addItem("Soup of the day",
                "Sout of the day, with a side of potato salad",
                false,
                3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false,
                3.05);
        // a couple of other Diner Menu items added here
    }
    
    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description,vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            throw new IllegalArgumentException(
                    "Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new Iterator<MenuItem>() {
            private int position = 0;

            @Override
            public boolean hasNext() {
                return position < numberOfItems;
            }

            @Override
            public MenuItem next() {
                if (position >= numberOfItems) {
                    throw new NoSuchElementException("Only " + numberOfItems + " elements!");
                }
                MenuItem menuItem = menuItems[position];
                position = position + 1;
                return menuItem;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException(
                        "Unsupported remove() operation in Iterator!");
            }
            
        };
    }
    
    // other menu methods here
}
