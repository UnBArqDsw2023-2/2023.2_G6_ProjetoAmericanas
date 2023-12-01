package handlers;
public class OrderReceivedHandler implements Handler {
    @Override
    public void execute() {
        System.out.println("Ordem recebida.");
    }
}
