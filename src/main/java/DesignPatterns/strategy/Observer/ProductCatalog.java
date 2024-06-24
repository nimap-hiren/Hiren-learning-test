package DesignPatterns.strategy.Observer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// ProductCatalog.java
@Component
public class ProductCatalog implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String product) {
        for (Observer observer : observers) {
            observer.update(product);
        }
    }

    // Method to add a new product and notify observers
    public void addProduct(String product) {
        System.out.println("Adding new product: " + product);
        notifyObservers(product);
    }
}
