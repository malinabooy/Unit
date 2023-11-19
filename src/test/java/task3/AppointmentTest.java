package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    Appointment appointment;
    Doctor doctor; //
    Patient patient;

    Date appointmentDate;
    @BeforeEach
    void setUp() {
        doctor = new Doctor("Vasya", "terapevt");
        patient = new Patient("Petr", "1");
        appointmentDate = new Date();
        appointment = new Appointment(doctor,patient, appointmentDate);
    }

    @Test
    @DisplayName("Првоерка получения доктора")
    void getDoctor() {
        assertEquals(doctor, appointment.getDoctor());
    }

    @Test
    @DisplayName("Проверка получения пациента")
    void getPatient() {
        assertEquals(patient, appointment.getPatient());
    }

    @Test
    @DisplayName("Проверка даты")
    void getDate() {
        assertEquals(appointmentDate, appointment.getDate());
    }
}