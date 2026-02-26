package third_level;

import java.time.LocalDateTime;
import java.time.Month;

public class ThirdLevelMain {
    public static void main(String[] args){
        // Exercise 1, 2 and 3
        Person person1 = new Person("Joe Dwight", 45);

        System.out.println("First person created: " + person1);
        System.out.println("age of first person created: " + person1.age());
        System.out.println("nameSurname of first person created: " + person1.nameSurname());

        try {
            Person person2 = new Person("Inés", -30);
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        }

        try {
            Person person2 = new Person("Mary", 150);
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
        }

        Person person4 = new Person("Alex Levin", 15);
        Person person5 = new Person("Paula Gonzalez", 40);
        Person person6 = new Person("Fernando Rodriguez", 16);
        Person person7 = new Person("Ryan Cooper", 50);
        Person person8 = new Person("Fred Pitt", 64);
        Person person9 = new Person("Andrea Nidoli", 55);

        // Exercise 4
        Event talentArenaEvent = new Event(LocalDateTime.of(2026, Month.MARCH, 3, 9, 0), "Talent Arena", 100);
        talentArenaEvent.addAttendee(person8);
        talentArenaEvent.addAttendee(person1, person4, person5, person6, person7);
        talentArenaEvent.addAttendee(person8);
        System.out.println("getAttendees() call of talentArenaEvent instance: " + talentArenaEvent.getAttendees());
        System.out.println("getAdultAttendees() call of talentArenaEvent instance: " + talentArenaEvent.getAdultAttendees());
        talentArenaEvent.addAttendee(person9);
        System.out.println("getAttendeesWithNameStartingWithA() call of talentArenaEvent instance: " + talentArenaEvent.getAttendeesWithNameStartingWithA());

        System.out.println(person4.getSurname());
        System.out.println(person1.getSurname());
        System.out.println(person5.getSurname());

        System.out.println(person4.getFinalPrice(talentArenaEvent.getPrice()));
    }
}
