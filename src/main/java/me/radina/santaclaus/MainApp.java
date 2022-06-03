package me.radina.santaclaus;


import me.radina.santaclaus.observer.Elf;
import me.radina.santaclaus.observer.MagicBoard;
import me.radina.santaclaus.singleton.SantaClaus;
import me.radina.santaclaus.singleton.Workshop;

public class MainApp {

    public static void main(String[] args) {
        final SantaClaus santaClaus = SantaClaus.getInstance();
        final MagicBoard magicBoard = MagicBoard.getInstance();

        new Elf(magicBoard);
        new Elf(magicBoard);
        new Elf(magicBoard);

        santaClaus.makeToys();

        System.out.println("\nFinal Statistics:" +
                "\nCreated toys: " + Workshop.getInstance().toysCount());
    }

}
