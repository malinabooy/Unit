package task4e;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {
    private UserService userService;
    private FakeUserRepository fakeUserRepository;

    @Before
    public void setUp() {
        fakeUserRepository = new FakeUserRepository();
        userService = new UserService(fakeUserRepository);
    }

    @Test
    public void testCreateUser_SavesUserCorrectly() {
        String userName = "John Doe";

// Вызываем метод для создания пользователя
        User newUser = userService.createUser(userName);

// Проверяем, что пользователь был сохранен в Fake репозитории
        assertTrue("Пользователь должен быть сохранен", fakeUserRepository.exists(userName));

// Проверяем, что возвращенный пользователь имеет правильное имя
        assertEquals("Возвращенный пользователь должен иметь заданное имя", userName, newUser.getName());
    }
}