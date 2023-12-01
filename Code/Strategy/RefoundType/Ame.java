package RefoundType;

import Refound.Refound;

public class Ame implements Refound {
    @Override
    public void refoundUser(Double total) {
        System.out.println("Refounding user in AME account R$"+total+".");
        System.out.println("This Action could take 15 days to complete.");
    }
}
