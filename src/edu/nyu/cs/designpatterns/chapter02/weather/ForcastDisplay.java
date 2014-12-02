package edu.nyu.cs.designpatterns.chapter02.weather;

/**
 * @author shenli
 * <p>
 * This display implements {@link edu.nyu.cs.designpatterns.chapter02.weather.Observer} so it can get changes 
 * from the {@link edu.nyu.cs.designpatterns.chapter02.weather.WeatherData} object. It also implements 
 * {@link edu.nyu.cs.designpatterns.chapter02.weather.DisplayElement} because our QPI is going to require all 
 * display elements to implement this interface.
 */
public class ForcastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    @SuppressWarnings("unused")
    private Subject weatherData;
    
    public ForcastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
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
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        
        display();
    }

}
