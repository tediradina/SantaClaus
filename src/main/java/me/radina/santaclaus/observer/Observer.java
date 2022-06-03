package me.radina.santaclaus.observer;

public interface Observer {
    void update(final String toy);
    void setTopic(Observable topic);
}
