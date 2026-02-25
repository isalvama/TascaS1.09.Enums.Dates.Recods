package third_level;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Event {
    private List<Person> attendees;
    private LocalDateTime dateTime;
    private String eventName;
    private double price;

    public Event(LocalDateTime dateTime, String eventName, double price){
        this.dateTime = dateTime;
        this.eventName = eventName;
        this.attendees = new ArrayList<>();
        this.price = price;
    }

    public List<Person> getAttendees () {
        return List.copyOf(attendees);
    }

    public double getPrice() {
        return price;
    }

    public void addAttendee (Person attendee) {
        if (!attendees.contains(attendee)){
            attendees.add(attendee);
        }
    }

    public void addAttendee (Person...people) {
        for (Person p : people) {
            if (!attendees.contains(p)) {
                attendees.add(p);
            }
        }
    }

    public List<Person> getAdultAttendees () {
        return getAttendees().stream().filter(a -> a.age() >= 18).toList();
    }

    public List<Person> getAttendeesWithNameStartingWithA () {
        return getAttendees().stream().filter(a -> a.nameSurname().toLowerCase().charAt(0) == 'a').toList();
    }
}
