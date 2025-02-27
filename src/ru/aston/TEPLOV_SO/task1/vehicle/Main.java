package ru.aston.TEPLOV_SO.task1.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Plane(),
                new Helicopter(),
                new Speedboat(),
                new Tanker(),
                new Truck(),
                new Taxi()};

        for (Vehicle vehicle : vehicles) {
            vehicle.print();
        }
    }
}
