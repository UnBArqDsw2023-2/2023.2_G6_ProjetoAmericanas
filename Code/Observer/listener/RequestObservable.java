package listener;

import handlers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestObservable {
    private String status;
    private Map<String, Handler> listenerHandlers = new HashMap<>();
    private UserObserver observer;

    /**
     * RequestObservable constructor only can create if exists user
     * @param observer
     */
    public RequestObservable(UserObserver observer) throws Exception {
        if(observer == null) throw new Exception("Missing user");

        this.observer = observer;
        this.setupListenerHandlers();
    }

    public void setupListenerHandlers() {
        listenerHandlers.put("OrderReceived", new OrderReceivedHandler());
        listenerHandlers.put("PaymentApproved", new PaymentApprovedHandler());
        listenerHandlers.put("NoteAvailable", new NoteAvailableHandler());
        listenerHandlers.put("Transport", new TransportHandler());
        listenerHandlers.put("Delivered", new DeliveredHandler());
    }
    public void setStatus(String novoStatus) {
        if (listenerHandlers.containsKey(novoStatus)) {
            this.status = novoStatus;
            listenerHandlers.get(novoStatus).execute();
            notifyObserver();
        }
    }

    private void notifyObserver() {
        observer.update(status);
    }
}
