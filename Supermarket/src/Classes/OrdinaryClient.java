package Classes;

/**
 * Класс обычного клиента магазина
 */
public class OrdinaryClient extends Actor {

    /**
     * Создание клиента с заданным именем
     * @param name имя клиента
     */
    public OrdinaryClient(String name) {
        super(name);
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