package ru.aston.TEPLOV_SO.task1.vehicle;

public interface IHasWings {
    public default String getWings() {
        return "имею крылья";
    }
}
