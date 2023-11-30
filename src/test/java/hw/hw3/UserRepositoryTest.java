package hw.hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    UserRepository userRepository;
    User adminUser;
    User regularUser1;
    User regularUser2;

    @BeforeEach
    void setUp() {
        // Инициализация объектов перед каждым тестом
        userRepository = new UserRepository();
        adminUser = new User("admin", "adminpass", true);
        regularUser1 = new User("user1", "userpass1", false);
        regularUser2 = new User("user2", "userpass2", false);
    }

    @Test
    void addUser() {
        // Добавление пользователей и проверка их наличия в репозитории
        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);
    }

    @Test
    void findByName() {
        // Добавление пользователей
        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        // Поиск пользователей по имени и проверка результатов
        assertTrue(userRepository.findByName("admin"));
        assertTrue(userRepository.findByName("user1"));
        assertTrue(userRepository.findByName("user2"));
        assertFalse(userRepository.findByName("nonexistentuser"));
    }

    @Test
    void logoutAllNonAdmins() {
        // Добавление пользователей
        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        // Аутентификация пользователей
        adminUser.authenticate("admin", "adminpass");
        regularUser1.authenticate("user1", "userpass1");
        regularUser2.authenticate("user2", "userpass2");

        // Проверка, что пользователи успешно аутентифицированы
        assertTrue(adminUser.isAuthenticate);
        assertTrue(regularUser1.isAuthenticate);
        assertTrue(regularUser2.isAuthenticate);

        // Разлогинивание всех неадминистраторов
        userRepository.logoutAllNonAdmins();

        // Проверка, что администратор не разлогинивается, а остальные пользователи разлогиниваются
        assertTrue(adminUser.isAuthenticate);
        assertFalse(regularUser1.isAuthenticate);
        assertFalse(regularUser2.isAuthenticate);
    }
}