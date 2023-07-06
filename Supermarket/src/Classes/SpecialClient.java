package Classes;

/**
 * Класс специальный клиент
 */
public class SpecialClient  extends Actor{

    private int idVip;

    /**
     * @param name  имя клиента
     * @param id
     */
    public  SpecialClient(String name, Integer id) {
        super(name);
        idVip = id; // id вип клиента
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
