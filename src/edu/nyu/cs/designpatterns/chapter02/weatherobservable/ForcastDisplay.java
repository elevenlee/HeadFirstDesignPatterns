package edu.nyu.cs.designpatterns.chapter02.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class ForcastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;
    
    public ForcastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void display() {
        System.out.print("Forcast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        }
        else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        }
        else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

}
