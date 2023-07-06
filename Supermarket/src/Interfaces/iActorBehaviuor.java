package Interfaces;

import Classes.Actor;

/**
 * Интерфейс поведения покупателя
 */
public interface iActorBehaviuor {

    /**
     * Метод получения заказа
     *
     */
    public boolean isTakeOrder();

    /**
     *
     * Метод принятия заказа
     */
    public boolean isMakeOrder();

    /**
     * @param takeOrder
     */
    public void setTakeOrder(boolean takeOrder);

    /**
     * @param makeOrder
     */
    public void setMakeOrder(boolean makeOrder);

    /**
     * @return
     */
    Actor getActor();
}
