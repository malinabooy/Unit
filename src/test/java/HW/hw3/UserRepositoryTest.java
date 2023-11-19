package HW.hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    UserRepository userRepository;
    User adminUser;
    User regularUser1;
    User regularUser2;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
        adminUser = new User("admin", "adminpass", true);
        regularUser1 = new User("user1", "userpass1", false);
        regularUser2 = new User("user2", "userpass2", false);
    }

    @Test
    void addUser() {
        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);
    }

    @Test
    void findByName() {
        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        assertTrue(userRepository.findByName("admin"));
        assertTrue(userRepository.findByName("user1"));
        assertTrue(userRepository.findByName("user2"));
        assertFalse(userRepository.findByName("nonexistentuser"));
    }

    @Test
    void logoutAllNonAdmins() {
        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        adminUser.authenticate("admin", "adminpass");
        regularUser1.authenticate("user1", "userpass1");
        regularUser2.authenticate("user2", "userpass2");

        assertTrue(adminUser.isAuthenticate);
        assertTrue(regularUser1.isAuthenticate);
        assertTrue(regularUser2.isAuthenticate);

        userRepository.logoutAllNonAdmins();

        assertTrue(adminUser.isAuthenticate); // Администратор не разлогинивается
        assertFalse(regularUser1.isAuthenticate); // Обычные пользователи разлогиниваются
        assertFalse(regularUser2.isAuthenticate);
    }
}