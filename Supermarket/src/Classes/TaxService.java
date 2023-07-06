package Classes;

import Interfaces.iActorBehaviuor;

/**
 *  Класс специального клиента
 */
public class TaxService implements iActorBehaviuor{

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxService() {
        this.name = "Tax audit"; // задаем неизменяемое имя
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}
