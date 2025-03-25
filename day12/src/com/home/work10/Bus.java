package com.home.work10;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private int id;
    private static final List<Bus> buses = new ArrayList<Bus>(3);
    static {
        for (int i = 0; i < 3; i++) {
            buses.add(new Bus());
        }
    }
    private Bus() {
    }
    public static Bus getBuses() {

        return buses.get((int) (Math.random() * buses.size()));
    }


}
