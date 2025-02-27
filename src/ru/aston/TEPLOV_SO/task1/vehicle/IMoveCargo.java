package ru.aston.TEPLOV_SO.task1.vehicle;

public interface IMoveCargo {
    public default String getCargo() {
        return "могу премещать груз";
    }
}
