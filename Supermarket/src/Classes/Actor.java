package Classes;

import Interfaces.iActorBehaviuor; // подключение интерфейса клиента
import Interfaces.iReturnOrder; // подключение интерфейса возврата товара

/**
 *  Абстрактный класс посетителя магазина
 */
public abstract class Actor implements iActorBehaviuor, iReturnOrder {
    /**
     *  Поле имени клиента
     */
    protected String name;
    /**
     *  Признак получения заказа
     */
    protected boolean isTakeOrder;
    /**
     * Признак того, сделал ла клиент заказ
     */
    protected boolean isMakeOrder;

    /**
     * Экземпляр клиента с заданным именем
     * @param name  имя с которым клиент будет инициализироваться
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Принимает переданное в конструкторе имя
     * @return  возвращает имя из конструктора
     */
    abstract public String getName();
}
