package com.engeto.homework;

import java.time.LocalDate;

public class Booking {
    private Room roomNumber;
    private Guest guestFirstName;
    private Guest guestLastName;
    private LocalDate reservationFrom;
    private LocalDate reservationTo;

    //Konstruktor
    public Booking(Room roomNumber, Guest guestFirstName, Guest guestLastName, LocalDate reservationFrom, LocalDate reservationTo) {
        this.roomNumber = roomNumber;
        this.guestFirstName = guestFirstName;
        this.guestLastName = guestLastName;
        this.reservationFrom = reservationFrom;
        this.reservationTo = reservationTo;
    }

    //Getter a Settery

    public Room getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Room roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Guest getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(Guest guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public Guest getGuestLastName() {
        return guestLastName;
    }

    public void setGuestLastName(Guest guestLastName) {
        this.guestLastName = guestLastName;
    }

    public LocalDate getReservationFrom() {
        return reservationFrom;
    }

    public void setReservationFrom(LocalDate reservationFrom) {
        this.reservationFrom = reservationFrom;
    }

    public LocalDate getReservationTo() {
        return reservationTo;
    }

    public void setReservationTo(LocalDate reservationTo) {
        this.reservationTo = reservationTo;
    }
}
