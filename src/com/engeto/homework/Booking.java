package com.engeto.homework;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private Room room;
    private Guest guest;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private List<Guest> otherGuests;


    //Konstruktor

    public Booking(Room room, Guest guest, LocalDate dateFrom, LocalDate dateTo, List<Guest> otherGuests) {
        this.room = room;
        this.guest = guest;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.otherGuests = otherGuests;
    }

    //Gettery a Settery


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }

    @Override
    public String toString() {
        return "Booking:" +
                "room:" + room +
                ", guest:" + guest +
                ", dateFrom:" + dateFrom +
                ", dateTo:" + dateTo +
                ", otherGuests:" + otherGuests;
    }
}
