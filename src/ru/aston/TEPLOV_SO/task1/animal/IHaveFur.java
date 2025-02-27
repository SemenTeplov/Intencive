package ru.aston.TEPLOV_SO.task1.animal;

public interface IHaveFur {
    public default String getFur() {
        return "имею шерсть";
    }
}
