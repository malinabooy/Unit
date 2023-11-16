package HW.hw2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testCarIsInstanceOfVehicle() {
        Vehicle car = new Car("Company", "Model", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHasFourWheels() {
        Car car = new Car("Company", "Model", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2023);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testCarDrivesAtSpeed60() {
        Car car = new Car("Company", "Model", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void testMotorcycleDrivesAtSpeed75() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testCarStopsWhenParked() {
        Car car = new Car("Company", "Model", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void testMotorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Company", "Model", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
