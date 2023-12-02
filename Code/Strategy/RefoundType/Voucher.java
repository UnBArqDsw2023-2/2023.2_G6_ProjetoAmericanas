package RefoundType;

import Refound.Refound;

public class Voucher implements Refound {
    @Override
    public void refoundUser(Double total) {
        System.out.println("Refounding user in current account R$"+total+".");
        System.out.println("This Action could take 1 day to complete.");
    }
}
