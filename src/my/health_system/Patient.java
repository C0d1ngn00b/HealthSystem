package my.health_system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Patient extends User{

    Hospital hospitalref = Hospital.getInstance();

    private List<Appointment> appointments;

    Patient(String firstName, String surname, String JMBG, String address, String gender, String phoneNumber,
            String username, String password, Role role) {
        super(firstName, surname, JMBG, address, gender, phoneNumber,
                username, password, role);
        this.appointments = new ArrayList<>();
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

     void scheduleAppointment(Doctor doctor, Date date, String reasonForAppointent) {
         Doctor appointmentDoctor = hospitalref.findDoctorByName(doctor.getSurname());
         if (appointmentDoctor != null) {
             Appointment appointment = new Appointment(this,doctor, date, Status.SCHEDULED, reasonForAppointent);
             this.appointments.add(appointment);
             appointmentDoctor.scheduleAppointment(this,date,Status.SCHEDULED,reasonForAppointent);
         } else {
             throw new IllegalArgumentException("Doctor not found: " + doctor.getSurname());
         }
    }

     void cancelAppointment(Appointment appointment) {
        if (appointment.getExaminationDate().after(new Date())) {
            appointment.setStatus(Status.CANCELLED);
            appointment.getDoctor().cancelAppointment(appointment);
        } else {
            throw new IllegalArgumentException("Cannot cancel past appointments");
        }
    }
}
