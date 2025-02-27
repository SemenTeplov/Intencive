package ru.aston.TEPLOV_SO.task1.vehicle;

public interface IHasScrew {
    public default String getScrew() {
        return "имею винт";
    }
}
