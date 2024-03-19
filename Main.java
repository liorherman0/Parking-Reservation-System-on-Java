package com.parkingsystem;

import com.parkingsystem.model.Reservation;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem(10); // Parking lot with 10 spaces

        // Reserve a parking space
        Reservation reservation = reservationSystem.reserveParking(1, LocalDateTime.now(), LocalDateTime.now().plusHours(2));
        if (reservation != null) {
            System.out.println("Reservation successful!");
            System.out.println("Reserved Space: " + reservation.getParkingSpace().getSpaceNumber());
            System.out.println("Start Time: " + reservation.getStartTime());
            System.out.println("End Time: " + reservation.getEndTime());
        } else {
            System.out.println("No available parking spaces.");
        }

        // Cancel the reservation
        if (reservation != null) {
            reservationSystem.cancelReservation(reservation);
            System.out.println("Reservation canceled. Space now available.");
        }
    }
}
