package edu.nyu.cs.designpatterns.chapter02.weather;

/**
 * @author shenli
 * <p>
 * This display implements {@link edu.nyu.cs.designpatterns.chapter02.weather.Observer} so it can get changes 
 * from the {@link edu.nyu.cs.designpatterns.chapter02.weather.WeatherData} object. It also implements 
 * {@link edu.nyu.cs.designpatterns.chapter02.weather.DisplayElement} because our QPI is going to require all 
 * display elements to implement this interface.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    @SuppressWarnings("unused")
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
