import listener.RequestObservable;
import listener.UserObserver;

public class Main {
    public static void main(String[] args) throws Exception {

        UserObserver user = new UserObserver("Carlos");
        RequestObservable request = new RequestObservable(user);

        request.setStatus("OrderReceived");
        request.setStatus("PaymentApproved");
        request.setStatus("NoteAvailable");
        request.setStatus("Transport");
        request.setStatus("Delivered");
    }
}