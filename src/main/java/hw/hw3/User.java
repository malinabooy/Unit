package hw.hw3;

public class User {
    String name;
    String password;
    boolean isAuthenticate = false;
    boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean authenticate(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            isAuthenticate = true;
            return true;
        }
        return false;
    }
}