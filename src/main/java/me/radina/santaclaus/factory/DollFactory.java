package me.radina.santaclaus.factory;

import me.radina.santaclaus.toy.DollToy;
import me.radina.santaclaus.toy.Toy;

public class DollFactory extends AbstractFactory {

    @Override
    public Toy create() {
        return new DollToy();
    }
}