package edu.nyu.cs.designpatterns.chapter02.weather;

/**
 * @author shenli
 * <p>
 * Both of {@code registerObserver()} and {@code removeObserver()} methods take an
 * {@link edu.nyu.cs.designpatterns.chapter02.weather.Observer} as an argument; that is, the 
 * {@link edu.nyu.cs.designpatterns.chapter02.weather.Observer} to be registered or removed.
 * <p>
 * The {@code notifyObservers()} method is called to notify all observers when the {@code Subject}'s state 
 * has changed.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
