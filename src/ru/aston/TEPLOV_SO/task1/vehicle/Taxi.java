package ru.aston.TEPLOV_SO.task1.vehicle;

public class Taxi extends Vehicle
        implements IHasWheel {

    public Taxi() {
        super("такси");
    }

    @Override
    public void print() {
        System.out.printf("я %s, %s",
                super.getName(),
                getWheels());
        System.out.println();
    }
}
