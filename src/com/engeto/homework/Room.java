package com.engeto.homework;

public class Room {
    private int roomNumber;
    private int countOfBed;
    private boolean balcony;
    private boolean seaView;
    private double pricePerNight;

    //region Konstruktor

    public Room(int roomNumber, int countOfBed, boolean balcony, boolean seaView, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.countOfBed = countOfBed;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    public Room(int roomNumber) {
        this(roomNumber,1,true,true,1000);
    }

    public Room(int roomNumber, int countOfBed) {
        this(roomNumber,countOfBed,false,true,2400);
    }

    //endregion


    //region Gettery a Settery

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCountOfBed() {
        return countOfBed;
    }

    public void setCountOfBed(int countOfBed) {
        this.countOfBed = countOfBed;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }


    //endregion


    @Override
    public String toString() {
        return "Room{" +
                "roomNumber: " + roomNumber +
                ", countOfBed: " + countOfBed +
                ", balcony:" + balcony +
                ", seaView:" + seaView +
                ", prise: " + pricePerNight+ " CZK"+
                '}';
    }
}
