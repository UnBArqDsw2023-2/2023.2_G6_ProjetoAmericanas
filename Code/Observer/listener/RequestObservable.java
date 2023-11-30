package listener;

import handlers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestObservable {
    private String status;
    private Map<String, Handler> statusHandlers = new HashMap<>();
    private List<UserObserver> observers = new ArrayList<>();

    public RequestObservable() {
        statusHandlers.put("OrderReceived", new OrderReceivedHandler());
        statusHandlers.put("PaymentApproved", new PaymentApprovedHandler());
        statusHandlers.put("NoteAvailable", new NoteAvailableHandler());
        statusHandlers.put("Transport", new TransportHandler());
        statusHandlers.put("Delivered", new DeliveredHandler());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String novoStatus) {
        if (statusHandlers.containsKey(novoStatus)) {
            this.status = novoStatus;
            notifyObservers();

            statusHandlers.get(novoStatus).execute();
        }
    }

    public void addObserver(UserObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(UserObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (UserObserver observer : observers) {
            observer.update(status);
        }
    }
}
