package ru.aston.TEPLOV_SO.task1.vehicle;

public class Speedboat extends Vehicle
        implements IHasScrew, IMoveCargo {

    public Speedboat() {
        super("катер");
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
