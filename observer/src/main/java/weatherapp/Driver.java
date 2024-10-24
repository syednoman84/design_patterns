package weatherapp;

import weatherapp.concreteobserver.PhoneDisplay;
import weatherapp.concreteobserver.TVDisplay;
import weatherapp.concretesubject.WeatherStation;
import weatherapp.observer.Observer;

/*
    Source: https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/
*/
public class Driver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Simulating weather change
        weatherStation.setWeather("Sunny");

        // Output:
        // Phone Display: Weather updated - Sunny
        // TV Display: Weather updated - Sunny
    }
}
