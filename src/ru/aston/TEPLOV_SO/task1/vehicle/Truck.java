package ru.aston.TEPLOV_SO.task1.vehicle;

public class Truck extends Vehicle
        implements IHasWheel, IMoveCargo {

    public Truck() {
        super("Грузовик");
    }

    @Override
    public void print() {
        System.out.printf("я %s, %s, %s",
                super.getName(),
                getWheels(),
                getCargo());
        System.out.println();
    }
}
