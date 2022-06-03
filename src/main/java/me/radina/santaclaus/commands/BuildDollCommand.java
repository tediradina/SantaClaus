package me.radina.santaclaus.commands;

import me.radina.santaclaus.observer.MagicBoard;

public class BuildDollCommand implements Command {
    @Override
    public void requestToy() {
        MagicBoard.getInstance().requestToy("Doll");
    }
}
