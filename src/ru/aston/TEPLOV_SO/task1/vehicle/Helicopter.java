package ru.aston.TEPLOV_SO.task1.vehicle;

public class Helicopter extends Vehicle
        implements IHasWheel, IHasScrew, IMoveCargo{

    public Helicopter() {
        super("вертолет");
    }

    @Override
    public void print() {
        System.out.printf("я %s, %s, %s, %s",
                super.getName(),
                getWheels(),
                getScrew(),
                getCargo());
        System.out.println();
    }
}
