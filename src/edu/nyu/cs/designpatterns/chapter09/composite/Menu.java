package edu.nyu.cs.designpatterns.chapter09.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Menu extends MenuComponent {
    private final List<MenuComponent> menuComponents;
    private final String name;
    private final String description;
    
    public Menu(String name, String description) {
        menuComponents = new ArrayList<MenuComponent>();
        this.name = name;
        this.description = description;
    }
    
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    
    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
    
    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------------");
        
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    /* (non-Javadoc)
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator<MenuComponent> iterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
        
    private class CompositeIterator implements Iterator<MenuComponent> {
        private final Stack<Iterator<MenuComponent>> stack =
                new Stack<Iterator<MenuComponent>>();
        
        public CompositeIterator(Iterator<MenuComponent> iterator) {
            stack.push(iterator);
        }
        
        @Override
        public boolean hasNext() {
            if (stack.empty()) {
                return false;
            } else {
                Iterator<MenuComponent> iterator = stack.peek();
                if (!iterator.hasNext()) {
                    stack.pop();
                    return hasNext();
                } else {
                    return true;
                }
            }
        }

        @Override
        public MenuComponent next() {
            if (hasNext()) {
                Iterator<MenuComponent> iterator = stack.peek();
                MenuComponent component = iterator.next();
                if (component instanceof Menu) {
                    stack.push(component.iterator());
                }
                return component;
            } else {
                return null;
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
}
