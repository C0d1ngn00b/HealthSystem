package my.health_system;

public abstract class User {
    protected String firstName;
    protected String surname;
    protected String JMBG;
    protected String address;
    protected String gender;
    protected String phoneNumber;
    private String username;
    private String password;
    private Role role;


    User(String firstName, String surname, String JMBG,
         String address, String gender, String phoneNumber,
         String username, String password, Role role) {
        this.firstName = firstName;
        this.surname = surname;
        this.JMBG = JMBG;
        this.address = address;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.role = role;

    }


    // getters and setter
// getters
    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getJMBG() {
        return JMBG;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    String getUsername() {
        return username;
    }

    String getPassword() {
        return password;
    }

    Role getRole() {
        return role;
    }

}
