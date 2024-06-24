package DesignPatterns.strategy.Observer;

// Subject.java
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String product);
}
