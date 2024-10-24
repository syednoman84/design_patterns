package weatherapp.subject;

import weatherapp.observer.Observer;

// Subject Interface
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}