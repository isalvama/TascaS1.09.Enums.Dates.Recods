package second_level;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String owner;
    private List<Appointment> appointmentList;

    public Agenda(String owner){
        this.owner = owner;
        appointmentList = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        if (appointment.getDate().isBefore(LocalDateTime.now())) {
            System.out.println("The appointment " + appointment + " could not be added because its date is earlier than now");
        } else {
            appointmentList.add(appointment);
        }

    }

    public List<Appointment> getNextAppointments (){
        return appointmentList.stream()
                .filter(a -> a.getDate().
                        isBefore(LocalDateTime.now().
                                plusDays(8))).
                toList();
    }

    public List<Appointment> getAppointmentList() {
        return List.copyOf(appointmentList);
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }
}
