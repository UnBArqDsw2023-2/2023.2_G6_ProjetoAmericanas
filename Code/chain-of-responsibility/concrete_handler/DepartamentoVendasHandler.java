package concrete_handler;

import ihandler.Handler;
import ihandler.Request;

public class DepartamentoVendasHandler implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(Request request) {
        if ("Comprei errado".equals(request.getReason()) || "Me arrependi".equals(request.getReason())) {
            System.out.println("Encaminhando a solicitação para o departamento de vendas.");
        } else if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}

