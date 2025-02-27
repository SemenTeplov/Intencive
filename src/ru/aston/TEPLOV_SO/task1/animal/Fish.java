package ru.aston.TEPLOV_SO.task1.animal;

public class Fish extends Animal implements ISweeming{
    public Fish() {
        super("рыба");
    }

    public void print() {
        System.out.printf("Я %s %s %s",
                super.getName(),
                super.getKind(),
                getSweem());
        System.out.println();
    }
}
