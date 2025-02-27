package ru.aston.TEPLOV_SO.task1.vehicle;

public class Tanker extends Vehicle
        implements IHasScrew, IMoveCargo {

    public Tanker() {
        super("танкер");
    }

    @Override
    public void print() {
        System.out.printf("я %s, %s, %s",
                super.getName(),
                getScrew(),
                getCargo());
        System.out.println();
    }
}
