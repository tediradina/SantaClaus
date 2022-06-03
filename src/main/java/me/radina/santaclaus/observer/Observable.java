package me.radina.santaclaus.observer;

import me.radina.santaclaus.toy.Toy;

public interface Observable {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);

    void notifyObservers();

    void requestToy(String toy);
}
