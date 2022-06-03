package me.radina.santaclaus.factory;

import me.radina.santaclaus.toy.BikeToy;
import me.radina.santaclaus.toy.Toy;

public class BikeFactory extends AbstractFactory {

    @Override
    public Toy create() {
        return new BikeToy();
    }
}