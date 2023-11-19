package task4a;

public class FakeOrderDatabase implements OrderDatabase {
    @Override
    public void store(Order order) {
        // Просто заглушка, ничего не делает
    }
}
