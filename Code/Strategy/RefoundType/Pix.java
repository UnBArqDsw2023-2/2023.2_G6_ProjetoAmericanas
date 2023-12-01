package RefoundType;

import Refound.Refound;

public class Pix implements Refound {
    @Override
    public void refoundUser(Double total) {
        System.out.println("Refounding R$"+total+", with pix");
        System.out.println("This Action could take 2 hours to complete.");
    }
}

