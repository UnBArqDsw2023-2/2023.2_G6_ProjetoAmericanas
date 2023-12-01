import concrete_handler.AtendimentoClienteHandler;
import concrete_handler.DepartamentoLogisticaHandler;
import concrete_handler.DepartamentoQualidadeHandler;
import concrete_handler.DepartamentoVendasHandler;
import ihandler.Handler;
import ihandler.Request;

public class Main {
    public static void main(String[] args) {
        AtendimentoClienteHandler depAtendimentoCliente = new AtendimentoClienteHandler();
        DepartamentoLogisticaHandler depLogistica = new DepartamentoLogisticaHandler();
        DepartamentoQualidadeHandler depQualidade = new DepartamentoQualidadeHandler();
        DepartamentoVendasHandler depVendas = new DepartamentoVendasHandler();

        depVendas.setNextHandler(depQualidade);
        depQualidade.setNextHandler(depLogistica);
        depLogistica.setNextHandler(depAtendimentoCliente);

        Request requisicao = new Request("Veio Errado ou Incompleto");

        depVendas.processRequest(requisicao);
    }
}
