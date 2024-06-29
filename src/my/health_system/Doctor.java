package my.health_system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doctor extends User{

    private List<Appointment> appointments;

    Doctor(String firstName, String surname, String JMBG, String address, String gender, String phoneNumber,
           String username, String password, Role role) {
        super(firstName, surname, JMBG, address, gender, phoneNumber,
                username, password, role);
        this.appointments = new ArrayList<>();
    }


    public String getFirstName() {
        return firstName;
    }
    public String getSurname() {
        return surname;
    }

    void cancelAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }

    void scheduleAppointment(Patient patient, Date date, Status status, String reasonForAppointent) {
        Appointment appointment = new Appointment(patient, this, date, status,reasonForAppointent);
        appointments.add(appointment);
    }

}
