package ReturnMode;

import Return.Return;

public class MailDeliver implements Return {
    @Override
    public void returnProduct(String productName) {
        System.out.println("The "+ productName + " will be returned by mail");
        System.out.println("This Action could take 15 days to complete.");
    }
}
