package listener;

public class UserObserver {
    private String name;

    public UserObserver(String name) {
        this.name = name;
    }

    public void update(String newStatus) {
        System.out.println("User " + name + ": Your order status has been changed to " + newStatus);
    }
}
