package edu.nyu.cs.designpatterns.chapter02.weather;

/**
 * @author shenli
 * <p>
 * This display implements {@link edu.nyu.cs.designpatterns.chapter02.weather.Observer} so it can get changes 
 * from the {@link edu.nyu.cs.designpatterns.chapter02.weather.WeatherData} object. It also implements 
 * {@link edu.nyu.cs.designpatterns.chapter02.weather.DisplayElement} because our QPI is going to require all 
 * display elements to implement this interface.
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex = 0.0f;
    @SuppressWarnings("unused")
    private Subject weatherData;
    
    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void display() {
        System.out.println("Head index is " + heatIndex);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        heatIndex = computeHeatIndex(temperature, humidity);
        display();
    }
    
    private float computeHeatIndex(float t, float rh) {
        float index = (float)(16.923
                + 0.185212 * t
                + 5.37941 *rh
                - 0.100254 * t * rh
                + 0.00941695 * t * t
                + 0.00728898 * rh * rh
                + 0.000345372 * t * t * rh
                - 0.000814971 * t * rh * rh
                + 0.0000102102 * t * t * rh * rh
                - 0.000038646 * t * t * t
                + 0.0000291583 * rh * rh * rh
                + 0.00000142721 * t * t * t * rh
                + 0.000000197483 * t * rh * rh * rh
                - 0.0000000218429 * t * t * t * rh * rh
                + 0.000000000843296 * t * t * rh * rh * rh
                - 0.0000000000481975 * t * t * t * rh * rh * rh);
        return index;
    }

}
