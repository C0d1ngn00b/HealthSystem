package my.health_system;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private static Hospital instance = null;
    private List<Doctor> doctors;

    private Hospital() {
        doctors = new ArrayList<>();
    }

    public static Hospital getInstance() {
        if (instance == null) {
            instance = new Hospital();
        }
        return instance;
    }

    public Doctor findDoctorByName(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getSurname().equals(name)) {
                return doctor;
            }
        }
        return null;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}