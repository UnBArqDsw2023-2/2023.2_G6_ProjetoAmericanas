package RefoundType;

import Refound.Refound;

public class VirtualCard implements Refound {
    @Override
    public void refoundUser(Double total) {
        System.out.println("Refounding user in Credit card R$"+total+".");
        System.out.println("This Action could take 10 days to complete.");
    }
}
