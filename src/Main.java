import com.engeto.homework.Booking;
import com.engeto.homework.Guest;
import com.engeto.homework.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. Vytvoření hostů a výpis na obrazovku
        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));

        System.out.println(guest1.getGuestFirstName()+" "+guest1.getQuestLastName()+" ("+guest1.getGuestBirthDate()+")");

        List<Guest> listOfGuests = new ArrayList<>();
        listOfGuests.add(guest1);
        listOfGuests.add(guest2);

        //2. Vytvoření pokojů, výpis na obrazovku + popis
        Room room1 = new Room (1);
        Room room2 = new Room (2);
        Room room3 = new Room (3,3);

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        System.out.println(roomList);


        //3. Booking
        Booking booking1 = new Booking (room1, guest1, LocalDate.of(2021,7,19), LocalDate.of(2021,7,26));
        Booking booking2 = new Booking (room3, guest1, LocalDate.of(2021,9,1), LocalDate.of(2021,9,14), listOfGuests));


        System.out.println();

    }
}