package edu.nyu.cs.designpatterns.chapter02.weather;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        @SuppressWarnings("unused")
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        @SuppressWarnings("unused")
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        @SuppressWarnings("unused")
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
        @SuppressWarnings("unused")
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
