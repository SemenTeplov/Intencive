package ru.aston.TEPLOV_SO.task1.animal;

import java.util.Objects;

public abstract class Animal {
    private final String NAME;
    private final String KIND;

    public Animal(String name) {
        this.NAME = name;
        this.KIND = "животное";
    }

    public Animal() {
        this("");
    }

    public String getName() {
        return this.NAME;
    }

    public String getKind() {
        return this.KIND;
    }

    public abstract void print();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(NAME, animal.NAME) && Objects.equals(KIND, animal.KIND);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(NAME, KIND);
    }
}
