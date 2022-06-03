package me.radina.santaclaus.singleton;

import me.radina.santaclaus.commands.BuildBikeCommand;
import me.radina.santaclaus.commands.BuildDollCommand;

public class SantaClaus {

    private static SantaClaus instance;

    private SantaClaus() {
    }

    public static SantaClaus getInstance() {
        if (instance == null) {
            instance = new SantaClaus();
        }
        return instance;
    }

    public void makeToys() {
        makeBikes(50);
        makeDolls(50);
    }

    public void makeBikes(int count) {
        for (int i = 0; i < count; i++) {
            new BuildBikeCommand().requestToy();
        }
    }

    public void makeDolls(int count) {
        for (int i = 0; i < count; i++) {
            new BuildDollCommand().requestToy();
        }
    }
}
