package handlers;
public class PaymentApprovedHandler implements Handler {
    @Override
    public void execute() {
        System.out.println("Pagamento aprovado.");
    }
}
