package second_level;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class SecondLevelMain {
    public static void main (String [] args) {
        // Exercise 1
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime todayTime = LocalDateTime.now();

        System.out.println("today value: " + today);
        System.out.println("time value: " + time);
        System.out.println("todayTime value: " + todayTime);

        // Exercise 2
        LocalDateTime dateTime = LocalDateTime.of(2020, Month.MARCH, 20, 13, 45);
        System.out.println("Result of getDifferenceInTime() call to with dateTime and TodayTime variables: + " + getDifferenceInTime(dateTime, todayTime));

        // Exercise 3
        System.out.println("Result of reduceMonths() call: " + reduceMonths(3, todayTime));
        System.out.println("Result of reduceDays() call: " + reduceDays(2, todayTime));
        System.out.println("Result of reduceHours() call: " + reduceHours(10, todayTime));

        // Exercise 4
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy MM dd hh : mm");
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter formatter3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println("Result of todayTime format set by formatter1: " + formatter1.format(todayTime));
        System.out.println("Result of todayTime format set by formatter2: " + formatter2.format(todayTime));
        System.out.println("Result of todayTime format set by formatter3: " + formatter3.format(todayTime));

        // Exercise 5
        System.out.println("Result of getIfDateIsBeforeOrAfter() call: " + getIfDateIsBeforeOrAfter(dateTime));

        // Exercise 6
        Agenda agenda1 = new Agenda("Joe");
        agenda1.addAppointment(new Appointment(LocalDateTime.of(2025, Month.MARCH, 22, 13, 0), "Doctor"));
        agenda1.addAppointment(new Appointment(LocalDateTime.of(2025, Month.APRIL, 13, 10, 0), "Presentation"));
        agenda1.addAppointment(new Appointment(LocalDateTime.of(2026, Month.FEBRUARY, 28, 9, 0), "Get project done"));
        agenda1.addAppointment(new Appointment(LocalDateTime.of(2026, Month.MARCH, 2, 10, 0), "Go to Talent Arena"));
        agenda1.addAppointment(new Appointment(LocalDateTime.of(2026, Month.MARCH, 5, 20, 0), "Meta event"));
        agenda1.addAppointment(new Appointment(LocalDateTime.of(2026, Month.MARCH, 20, 21, 0), "Finish sprint 3"));
        agenda1.addAppointment(new Appointment(LocalDateTime.of(2026, Month.APRIL, 15, 21, 0), "Finish sprint 4"));
        System.out.println("Result of getNextAppointments() call for agenda1: " + agenda1.getNextAppointments());
    }

    public static String getDifferenceInTime(LocalDateTime date1, LocalDateTime date2){
       Period dateDiff = Period.between(date1.toLocalDate(), date2.toLocalDate());
       Duration durDiff = Duration.between(date1.toLocalTime(), date1.toLocalTime());
       int minutes = (int)(durDiff.toMinutes() - (durDiff.toHours()*60));
       return (dateDiff.getYears() + " years, " + dateDiff.getMonths() + " months, " + dateDiff.getDays() + " days, " + durDiff.toHours() + " hours and " + minutes + " minutes.");
    }

    public static LocalDateTime reduceMonths(int nMonths, LocalDateTime date){
        return date.minusMonths(nMonths);
    }

    public static LocalDateTime reduceDays(int nDays, LocalDateTime date){
       return date.minusDays(nDays);
    }

    public static LocalDateTime reduceHours(int nHours, LocalDateTime date){
        return date.minusHours(nHours);
    }

    public static String getIfDateIsBeforeOrAfter(LocalDateTime date){
        return date.isBefore(LocalDateTime.now()) ? "The date is earlier than now." : "The date is after now.";
    }

}
