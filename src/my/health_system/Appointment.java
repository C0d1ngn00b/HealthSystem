package my.health_system;

import java.util.Date;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private Date examinationDate;
    private Status status;
    private String therapyDescription;

    public Appointment(Patient patient, Doctor doctor, Date examinationDate,
                       Status status, String therapyDescription) {
        this.patient = patient;
        this.doctor = doctor;
        this.examinationDate = examinationDate;
        this.status = status;
        this.therapyDescription = therapyDescription;
    }

     protected Date getExaminationDate() {
        return examinationDate;
    }

    protected void setStatus(Status status){
        this.status = status;
    }

    protected Doctor getDoctor(){
        return doctor;
    }

    protected Patient getPatient(){
        return patient;
    }


}
