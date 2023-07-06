package Interfaces;

/**
 * Данный интерфейс содержит методы для работы с очередью в магазине
 */
public interface iQueueBehaviour {

    /**
     * Принимает клиента в очередь
     * @param actor клиент, которого нужно принять
     */
    void  takeInQueue(iActorBehaviuor actor);

    /**
     *  Освобождает очередь для заказов
     */
    void releaseFromQueue();

    /**
     * Сделать заказ
     */
    void takeOrder();

    /**
     * Выдать заказ
     */
    void giveOrder();
}
