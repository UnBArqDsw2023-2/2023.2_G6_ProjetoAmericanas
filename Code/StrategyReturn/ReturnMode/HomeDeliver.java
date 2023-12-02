package ReturnMode;

import Return.Return;

public class HomeDeliver implements Return {
    @Override
    public void returnProduct(String productName) {
        System.out.println("The "+ productName + " will be delivered to your home");
        System.out.println("This Action could take 15 days to complete.");
    }
}
