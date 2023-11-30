package task5b;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Метод для получения email пользователя по его имени пользователя
    public String getEmailByUsername(String username) {
        User user = userRepository.getUserByUsername(username);

        if (user != null) {
            return user.getEmail();
        } else {
            return null;
        }
    }
}
