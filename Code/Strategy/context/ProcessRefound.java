package context;

import Refound.Refound;

public class ProcessRefound {
    private Refound refoundType;

    public ProcessRefound(Refound refoundType) {
        this.refoundType = refoundType;
    }

    public void setMethod(Refound refoundType) {
        this.refoundType = refoundType;
    }

    public void refoundValue(Double total){
        this.refoundType.refoundUser(total);
    }
}
