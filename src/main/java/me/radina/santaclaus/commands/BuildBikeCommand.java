package me.radina.santaclaus.commands;

import me.radina.santaclaus.observer.MagicBoard;

public class BuildBikeCommand implements Command {
    @Override
    public void requestToy() {
        MagicBoard.getInstance().requestToy("Bike");
    }
}
