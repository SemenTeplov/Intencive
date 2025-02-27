package ru.aston.TEPLOV_SO.task1.animal;

public class Whale extends Mammal implements ISweeming {
    public Whale() {
        super("кит");
    }

    public void print() {
        System.out.printf("Я %s %s %s %s",
                super.getName(),
                super.getKind(),
                super.getType(),
                getSweem());
        System.out.println();
    }
}
