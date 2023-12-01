package ProcessReturn;

import Return.Return;

public class ProcessReturn {
    private Return returnMode;

    public ProcessReturn(Return returnMode) {
        this.returnMode = returnMode;
    }

    public void setMethod(Return returnMode) {
        this.returnMode = returnMode;
    }

    public void refoundValue(String produto){
        this.returnMode.returnProduct(produto);
    }
    
}
