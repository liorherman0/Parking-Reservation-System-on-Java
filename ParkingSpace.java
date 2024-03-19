package com.parkingsystem.model;

public class ParkingSpace {
    private int spaceNumber;
    private boolean available;

    public ParkingSpace(int spaceNumber) {
        this.spaceNumber = spaceNumber;
        this.available = true;
    }

    public int getSpaceNumber() {
        return spaceNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
