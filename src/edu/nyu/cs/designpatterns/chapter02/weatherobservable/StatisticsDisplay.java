package edu.nyu.cs.designpatterns.chapter02.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float minTemp = 200;
    private float maxTemp = 0.0f;
    private float tempSum = 0.0f;
    private int numReadings;
    
    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + (tempSum / numReadings) + "/"
                + maxTemp + "/"
                + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temperature = weatherData.getTemperature();
            tempSum += temperature;
            numReadings++;
            if (temperature > maxTemp) {
                maxTemp = temperature;
            }
            if (temperature < minTemp) {
                minTemp = temperature;
            }
            display();
        }
    }

}
