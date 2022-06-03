package me.radina.santaclaus.singleton;

import me.radina.santaclaus.toy.Toy;

import java.util.ArrayList;
import java.util.List;

public class Workshop {
    private static Workshop instance;

    private Workshop() {
    }

    public static Workshop getInstance() {
        if (instance == null) {
            instance = new Workshop();
        }
        return instance;
    }

    private final List<Toy> storage = new ArrayList<>();

    public boolean addToyToStorage(Toy toy) {
        return this.storage.add(toy);
    }

    public int toysCount() {
        return storage.size();
    }
}
