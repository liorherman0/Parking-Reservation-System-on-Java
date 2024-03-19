package com.parkingsystem.model;

import java.time.LocalDateTime;

public class Reservation {
    private int reservationId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ParkingSpace parkingSpace;

    public Reservation(int reservationId, LocalDateTime startTime, LocalDateTime endTime, ParkingSpace parkingSpace) {
        this.reservationId = reservationId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.parkingSpace = parkingSpace;
    }

    public int getReservationId() {
        return reservationId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }
}
