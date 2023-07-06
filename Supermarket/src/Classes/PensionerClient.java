package Classes;

public class PensionerClient extends Actor {
    private int pensID;

    public PensionerClient(String name, int pensID) {
        super(name+" - пенсионер");
        this.pensID = pensID;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public boolean refundProduct() {
        return false;
    }

    public boolean checkProduct() {
        return false;
    }

    public boolean failureRefund() {
        return false;
    }

    public void refundMoney() {

    }

    public Actor getActor() {
        return this;
    }

}