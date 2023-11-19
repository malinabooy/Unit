package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    Doctor doctor;
    @BeforeEach
    void setUp() {
        doctor = new Doctor("Vasya", "terapevt");
    }

    @Test
    void getName() {
        assertEquals("Vasya", doctor.getName());
    }

    @Test
    void getSpecialization() {
        assertEquals("terapevt", doctor.getSpecialization());
    }
}