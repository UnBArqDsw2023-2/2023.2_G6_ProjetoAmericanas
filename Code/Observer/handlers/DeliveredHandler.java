package handlers;
public class DeliveredHandler implements Handler {
    @Override
    public void execute() {
        System.out.println("Entregue.");
    }
}
