package test;

import context.ProcessRefound;
import Refound.Refound;
import RefoundType.Card;
import RefoundType.VirtualCard;
import RefoundType.Pix;

public class Main {
    public static void main(String[] args) {
        Refound pix = new Pix();
        ProcessRefound api = new ProcessRefound(pix);
        api.refoundValue(45d);
        api.setMethod(new VirtualCard());
        api.refoundValue(80d);
    }
}
