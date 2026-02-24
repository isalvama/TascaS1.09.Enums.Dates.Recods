package second_level;

import java.time.LocalDateTime;

public class Appointment {
    private LocalDateTime date;
    private String appointmentBody;

    public Appointment(LocalDateTime date, String appointmentBody) {
        this.date = date;
        this.appointmentBody = appointmentBody;
    }

    public LocalDateTime getDate(){
        return date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "date=" + date +
                ", appointmentBody='" + appointmentBody + '\'' +
                '}';
    }
}
