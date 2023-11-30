package hw.hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    User user;
    User adminUser;

    @BeforeEach
    void setUp() {
        // Инициализация объектов перед каждым тестом
        user = new User("testUser", "correctPassword", false);
        adminUser = new User("admin", "adminpass", true);
    }

    @Test
    void testAuthenticateWithIncorrectUsername() {
        // Проверка аутентификации с некорректным именем пользователя
        assertFalse(user.authenticate("incorrectUser", "correctPassword"));
        assertFalse(user.isAuthenticate); // Проверка, что пользователь не аутентифицирован
    }

    @Test
    void testAuthenticateWithIncorrectPassword() {
        // Проверка аутентификации с некорректным паролем
        assertFalse(user.authenticate("testUser", "incorrectPassword"));
        assertFalse(user.isAuthenticate); // Проверка, что пользователь не аутентифицирован
    }

    @Test
    void testAuthenticateWithIncorrectCredentials() {
        // Проверка аутентификации с некорректными учетными данными
        assertFalse(user.authenticate("incorrectUser", "incorrectPassword"));
        assertFalse(user.isAuthenticate); // Проверка, что пользователь не аутентифицирован
    }

    @Test
    void testAuthenticateWithAdminUser() {
        // Проверка аутентификации администратора
        assertTrue(adminUser.authenticate("admin", "adminpass"));
        assertTrue(adminUser.isAuthenticate); // Проверка, что администратор аутентифицирован
        assertTrue(adminUser.isAdmin); // Проверка, что пользователь является администратором
    }
}