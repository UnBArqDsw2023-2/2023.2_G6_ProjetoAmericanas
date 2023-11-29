package concrete_handler;

import ihandler.Handler;
import ihandler.Request;

public class AtendimentoClienteHandler implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(Request request) {
        System.out.println("Encaminhando a solicitação para o departamento de Atendimento ao cliente");

    }
}
