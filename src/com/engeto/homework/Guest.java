package com.engeto.homework;

import java.time.LocalDate;

public class Guest {
    private String guestFirstName;
    private String questLastName;
    private LocalDate guestBirthDate;

    //region Konstruktor (guest)

    public Guest(String guestFirstName, String questLastName, LocalDate guestBirthDate) {
        this.guestFirstName = guestFirstName;
        this.questLastName = questLastName;
        this.guestBirthDate = guestBirthDate;
    }

    //endregion

    //region Getter and Setter

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public String getQuestLastName() {
        return questLastName;
    }

    public void setQuestLastName(String questLastName) {
        this.questLastName = questLastName;
    }

    public LocalDate getGuestBirthDate() {
        return guestBirthDate;
    }

    public void setGuestBirthDate(LocalDate guestBirthDate) {
        this.guestBirthDate = guestBirthDate;
    }

    //endregion


    @Override
    public String toString() {
        return "Guest{" +
                "guest Name'" + guestFirstName +" "+ questLastName + '\'' +
                ", BirthDate:" + guestBirthDate +
                '}';
    }
}
