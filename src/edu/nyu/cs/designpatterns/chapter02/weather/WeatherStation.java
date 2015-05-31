package edu.nyu.cs.designpatterns.chapter02.weather;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForcastDisplay(weatherData);
        new HeatIndexDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
