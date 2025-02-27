package ru.aston.TEPLOV_SO.task1.vehicle;

public class Plane extends Vehicle
        implements IHasWheel, IHasScrew, IHasWings, IMoveCargo {

    public Plane() {
        super("самолет");
    }

    @Override
    public void print() {
        System.out.printf("я %s, %s, %s, %s, %s",
                super.getName(),
                getWheels(),
                getScrew(),
                getWings(),
                getCargo());
        System.out.println();
    }
}
