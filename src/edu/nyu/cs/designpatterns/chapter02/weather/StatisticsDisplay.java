package edu.nyu.cs.designpatterns.chapter02.weather;

/**
 * @author shenli
 * <p>
 * This display implements {@link edu.nyu.cs.designpatterns.chapter02.weather.Observer} so it can get changes 
 * from the {@link edu.nyu.cs.designpatterns.chapter02.weather.WeatherData} object. It also implements 
 * {@link edu.nyu.cs.designpatterns.chapter02.weather.DisplayElement} because our QPI is going to require all 
 * display elements to implement this interface.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemp = 200;
    private float maxTemp = 0.0f;
    private float tempSum = 0.0f;
    private int numReadings;
    @SuppressWarnings("unused")
    private Subject weatherData;
    
    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + (tempSum / numReadings) + "/"
                + maxTemp + "/"
                + minTemp);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
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
