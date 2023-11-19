package task3;

import java.util.Date;

class Appointment {
    private Doctor doctor;
    private Patient patient;
    private Date date;

    public Appointment(Doctor doctor, Patient patient, Date date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public Date getDate() {
        return this.date;
    }
}

