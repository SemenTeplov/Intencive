package ru.aston.TEPLOV_SO.task1.vehicle;

public interface IHasWheel {
    public default String getWheels() {
        return "имею колёса";
    }
}
