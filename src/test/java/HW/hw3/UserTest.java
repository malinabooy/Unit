package HW.hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void setUp() {
        user = new User("testUser", "correctPassword", false);
    }

    @Test
    void testAuthenticateWithIncorrectUsername() {
        assertFalse(user.authenticate("incorrectUser", "correctPassword"));
        assertFalse(user.isAuthenticate);
    }

    @Test
    void testAuthenticateWithIncorrectPassword() {
        assertFalse(user.authenticate("testUser", "incorrectPassword"));
        assertFalse(user.isAuthenticate);
    }

    @Test
    void testAuthenticateWithIncorrectCredentials() {
        assertFalse(user.authenticate("incorrectUser", "incorrectPassword"));
        assertFalse(user.isAuthenticate);
    }
}