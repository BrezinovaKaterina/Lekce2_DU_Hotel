import com.engeto.homework.Guest;
import com.engeto.homework.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. Vytvoření hostů a výpis na obrazovku
        Guest guest1 = new Guest("Adéla","Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));

        System.out.println(guest1.getGuestFirstName()+" "+guest1.getQuestLastName()+" ("+guest1.getGuestBirthDate()+")");

        //2. Vytvoření pokojů, výpis na obrazovku + popis
        Room room1 = new Room (1);
        Room room2 = new Room (2);
        Room room3 = new Room (3,3);

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        System.out.println(roomList);

    }
}