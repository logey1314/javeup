package com.my.homework4;

public class Test {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Cinema cinema = new Cinema();
        bus.charge();
        taxi.charge();
        cinema.charge();
        cinema.play();
    }
}
