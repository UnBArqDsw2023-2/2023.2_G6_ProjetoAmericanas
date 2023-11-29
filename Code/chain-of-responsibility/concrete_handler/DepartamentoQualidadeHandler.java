package concrete_handler;

import ihandler.Handler;
import ihandler.Request;

public class DepartamentoQualidadeHandler implements Handler{
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(Request request) {
        if ("Veio com Defeito".equals(request.getReason()) || "Veio Quebrado".equals(request.getReason())) {
            System.out.println("Encaminhando a solicitação para o departamento de qualidade.");
        } else if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}
