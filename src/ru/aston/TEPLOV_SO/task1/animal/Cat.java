package ru.aston.TEPLOV_SO.task1.animal;

public class Cat extends Mammal implements IHaveFur {
    public Cat() {
        super("кошка");
    }

    public void print() {
        System.out.printf("Я %s %s %s %s",
                super.getName(),
                super.getKind(),
                super.getType(),
                getFur());
        System.out.println();
    }
}
