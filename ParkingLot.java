package com.parkingsystem.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpace> spaces;

    public ParkingLot(int capacity) {
        spaces = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            spaces.add(new ParkingSpace(i));
        }
    }

    public List<ParkingSpace> getAvailableSpaces() {
        List<ParkingSpace> availableSpaces = new ArrayList<>();
        for (ParkingSpace space : spaces) {
            if (space.isAvailable()) {
                availableSpaces.add(space);
            }
        }
        return availableSpaces;
    }
}
