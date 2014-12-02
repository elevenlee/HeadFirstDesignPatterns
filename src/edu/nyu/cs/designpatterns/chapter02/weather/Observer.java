package edu.nyu.cs.designpatterns.chapter02.weather;

/**
 * @author shenli
 * <p>
 * The {@code Observer} interface is implemented by all observers, so they  all have to implements the 
 * {@code update()} method.
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
