package me.radina.santaclaus.observer;

import me.radina.santaclaus.commands.BuildBikeCommand;
import me.radina.santaclaus.commands.BuildDollCommand;
import me.radina.santaclaus.commands.Command;
import me.radina.santaclaus.factory.AbstractFactory;
import me.radina.santaclaus.factory.BikeFactory;
import me.radina.santaclaus.factory.DollFactory;
import me.radina.santaclaus.singleton.Workshop;
import me.radina.santaclaus.toy.Toy;

public class Elf implements Observer {
    private Observable topic;

    public Elf(Observable topic) {
        this.topic = topic;
        this.topic.subscribe(this);
    }

    @Override
    public void update(final String toy) {
        final AbstractFactory factory;
        switch (toy){
            case "Doll":
                factory = new DollFactory();
                break;
            case "Bike": default:
                factory = new BikeFactory();
                break;
        }

        final Toy builtToy = factory.create();
        Workshop.getInstance().addToyToStorage(builtToy);
    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;
    }

}
