package Classes;

public class SpecialClient  extends Actor{

    private int idVip;

    public  SpecialClient(String name, Integer id) {
        super(name);
        idVip = id;
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

    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
        return this;
    }
}