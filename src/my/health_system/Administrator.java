package my.health_system;

public class Administrator extends User {


    Administrator(String firstName, String surname, String JMBG, String address, String gender, String phoneNumber, String username, String password, Role role) {
        super(firstName, surname, JMBG, address, gender, phoneNumber, username, password, role);
    }

    public User createUser(String name, String surname, String JMBG, String gender, String address, String phoneNumber, String username,
                           String password, Role role) {
        switch (role) {
            case ADMINISTRATOR:
                return new Administrator(name, surname, JMBG, gender, address, phoneNumber, username, password, role);
            case PATIENT:
                return new Patient(name, surname, JMBG, gender, address, phoneNumber, username, password, role);
            case DOCTOR:
                return new Doctor(name, surname, JMBG, gender, address, phoneNumber, username, password, role);
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }
}


