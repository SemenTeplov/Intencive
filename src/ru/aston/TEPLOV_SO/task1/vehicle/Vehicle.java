package ru.aston.TEPLOV_SO.task1.vehicle;

public abstract class Vehicle {
    private final String name;

    public Vehicle() {
        this.name = "";
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void print();

    @Override
    public int hashCode() {
        return 31 * this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.hashCode() == this.hashCode()) {
            Vehicle tmp = (Vehicle)obj;

            if (tmp.getName().equals(this.name)) {
                return true;
            }
        }

        return false;
    }
}
