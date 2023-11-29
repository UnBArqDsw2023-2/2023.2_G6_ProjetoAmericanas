package concrete_handler;

import ihandler.Handler;
import ihandler.Request;

public class DepartamentoLogisticaHandler implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(Request request) {
        if ("Veio Errado ou Incompleto".equals(request.getReason())) {
            System.out.println("Encaminhando a solicitação para o departamento de Logistica.");
        } else if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}
