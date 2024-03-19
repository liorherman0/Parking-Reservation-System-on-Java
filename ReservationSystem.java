package com.parkingsystem;

import com.parkingsystem.model.ParkingLot;
import com.parkingsystem.model.ParkingSpace;
import com.parkingsystem.model.Reservation;

import java.time.LocalDateTime;

public class ReservationSystem {
    private ParkingLot parkingLot;

    public ReservationSystem(int capacity) {
        parkingLot = new ParkingLot(capacity);
    }

    public Reservation reserveParking(int reservationId, LocalDateTime startTime, LocalDateTime endTime) {
        for (ParkingSpace space : parkingLot.getAvailableSpaces()) {
            space.setAvailable(false);
            return new Reservation(reservationId, startTime, endTime, space);
        }
        return null; // No available spaces
    }

    public void cancelReservation(Reservation reservation) {
        reservation.getParkingSpace().setAvailable(true);
    }
}
