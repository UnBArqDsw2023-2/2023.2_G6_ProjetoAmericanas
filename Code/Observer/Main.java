import listener.RequestObservable;
import listener.UserObserver;

public class Main {
    public static void main(String[] args) {

        UserObserver user = new UserObserver("Carlos");
        RequestObservable request = new RequestObservable();

        request.addObserver(user);

        request.setStatus("OrderReceived");
        request.setStatus("PaymentApproved");
        request.setStatus("NoteAvailable");
        request.setStatus("Transport");
        request.setStatus("Delivered");
    }
}