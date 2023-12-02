package ReturnMode;

import Return.Return;

public class InStore implements Return {
    @Override
    public void returnProduct(String productName) {
        System.out.println("The "+ productName + " will picked in the store when available");
        System.out.println("This Action could take 15 days to complete.");
    }
}
