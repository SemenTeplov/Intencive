package ru.aston.TEPLOV_SO.task1.animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Fish(),
                new Whale(),
                new Cat(),
                new Bear()};

        for (Animal animal : animals) {
            animal.print();
        }
    }
}
