package task4e;

import java.util.HashMap;
import java.util.Map;

public class FakeUserRepository implements UserRepository {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getName(), user);
    }

    public boolean exists(String name) {
        return users.containsKey(name);
    }
}
