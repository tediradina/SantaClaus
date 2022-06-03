package me.radina.santaclaus.observer;

import me.radina.santaclaus.toy.Toy;

import java.util.LinkedList;
import java.util.List;

public class MagicBoard implements Observable{

    private static MagicBoard instance;
    private final List<Observer> subscribers = new LinkedList<>();
    private String state;

    private MagicBoard() {
    }

    public static MagicBoard getInstance() {
        if (instance == null) {
            instance = new MagicBoard();
        }
        return instance;
    }

    @Override
    public void subscribe(final Observer observer) {
        if(subscribers.contains(observer)){
            return;
        }
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(final Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (final Observer subscriber : subscribers) {
            subscriber.update(state);
        }
    }

    @Override
    public void requestToy(final String toy) {
        this.state = toy;
        notifyObservers();
    }

}
